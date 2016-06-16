



function init_dlg(dlg, size)
{
	//$(dlg).show("slow");
	
	$( dlg ).dialog({
		  title:"明细",
	      autoOpen: false,
	      width:size.width,
		  height:size.height,
	      show: {
	        effect: "blind",
	        duration: 200
	      },
	      hide: {
	        effect: "blind",
	        duration: 200
	      }
	    });
}

function show_dlg(dlg)
{
	$( dlg ).dialog("open");
}
function hide_dlg(dlg)
{
	$( dlg ).dialog("close");
}


function init_list(listname, columntype, action, toolbar)
{
	var columns = $.ajax({  
        url: "getTableColumnsByTableName.do?tablename="+columntype,  
        type: "GET",  
        async: false,  
        cache: false,  
        error: function (XMLHttpRequest, textStatus, errorThrown) { alert(XMLHttpRequest.readyState); }  
    });  
	
	var columns_str = [{'field':'ck',title:'',width:20,checkbox:true}];
		
	$.parseJSON(columns.responseText).forEach(function(e){columns_str.push(e)});

	
	/*
	var datas = $.ajax({  
        url: action,  
        type: "GET",  
        async: false,  
        cache: false,  
        error: function (XMLHttpRequest, textStatus, errorThrown) { alert(XMLHttpRequest.readyState); }  
    });  
	var datas_str = $.parseJSON(datas.responseText);
	
	//console.log(columns_str);
    
    */
    
    $(listname).datagrid({
        url:action,
        rownumbers:true,
        singleSelect:true,
        method:'get',
        toolbar:toolbar,
        pagination:true,
        columns:[columns_str]
    });	
}

function reload_list(listname)
{
	$(listname).datagrid('reload');
}

function filter_list(listname, action, datajson)
{
    $(listname).datagrid({  
        url:action,  
        queryParams:datajson
    });  
}

function init_list_paging(dg)
{
    var opts =  $(dg).datagrid('options');
	var pager = $(dg).datagrid('getPager');
	pager.pagination({
		onSelectPage:function(pageNum, pageSize){
			opts.pageNumber = pageNum;
			opts.pageSize = pageSize;
			pager.pagination('refresh',{
				pageNumber:pageNum,
				pageSize:pageSize
			});
		}
	});
}


function init_combobox_option(cb, optype, needAll, needEmpty)
{
	var types = $.ajax({  
        url: 'getTableMetadatasByTableName.do?id='+optype,  
        type: "GET",  
        async: false,  
        cache: false,  
        error: function (XMLHttpRequest, textStatus, errorThrown) { alert(XMLHttpRequest.readyState); }  
    });  
	
	//var types_obj = $.parseJSON(types.responseText);
	
	var obj_all  = {"id":optype+"_all","title":"全部","value":"_all","decsription":"全部","sortorder":0};
	var obj_empty  = {"id":optype+"_empty","title":"无","value":"_empty","decsription":"无","sortorder":0};
	
	var rows = [];
	
	
	if(needAll == true) 
	{
		//$(cb).append("<option value='all'>全部</option>");
		rows.push(obj_all);
		
	}
	if(needEmpty == true) 
	{
		//$(cb).append("<option value='empty'>无</option>");
		rows.push(obj_empty);
	}	
	
	rows=$.merge(rows,types.responseJSON);
	
	$(cb).combobox({
        data: rows,
        valueField: 'value',
        textField: 'title',
        panelHeight:'auto'
       });
	return true;
}

function ExportExcel(listname, action, datajson)
{
    $(listname).datagrid({  
        url:action,  
        queryParams:datajson
    });  
}


function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = year + seperator1 + month + seperator1 + strDate
            + " " + date.getHours() + seperator2 + date.getMinutes()
            + seperator2 + date.getSeconds();
    return currentdate;
}

function getNowStreamDate() {
    var date = new Date();
    var seperator1 = "";
    var seperator2 = "";
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = year + month + strDate + date.getHours() + date.getMinutes()+ date.getSeconds();
    return currentdate;
}



function JSONToCSVConvertor(JSONData, ReportTitle, ShowLabel) {
    //If JSONData is not an object then JSON.parse will parse the JSON string in an Object
    var arrData = typeof JSONData != 'object' ? JSON.parse(JSONData) : JSONData;
 
    var CSV = '';
    //Set Report title in first row or line
 
    CSV  = ReportTitle + '\r\n\n';
 
    //This condition will generate the Label/Header
    if (ShowLabel) {
        var row = "";
 
        //This loop will extract the label from 1st index of on array
        for (var index in arrData[0]) {
 
            //Now convert each value to string and comma-seprated
            row  += index + ',';
        }
 
        row = row.slice(0, -1);
 
        //append Label row with line break
        CSV  += row + '\r\n';
    }
 
    //1st loop is to extract each row
    for (var i = 0; i < arrData.length; i++) {
        var row = "";
 
        //2nd loop will extract each column and convert it in string comma-seprated
        for (var index in arrData[i]) {
            row  += '"\'' + arrData[i][index] + '",';
        }
 
        row.slice(0, row.length - 1);
 
        //add a line break after each row
        CSV  += row + '\r\n';
    }
 
    if (CSV == '') {
        alert("Invalid data");
        return;
    }
 
    //Generate a file name
    var fileName = "MyReport_";
    //this will remove the blank-spaces from the title and replace it with an underscore
    fileName  += ReportTitle.replace(/ /g, "_");
    
    //Initialize file format you want csv or xls
    var uri = 'data:text/csv;charset=utf-8,' + "\xEF\xBB\xBF" + (CSV);
 
    // Now the little tricky part.
    // you can use either>> window.open(uri);
    // but this will not work in some browsers
    // or you will not get the correct file extension    
 
    //this trick will generate a temp <a /> tag
    var link = document.createElement("a");
    link.href = uri;
 
    //set the visibility hidden so it will not effect on your web-layout
    link.style = "visibility:hidden";
    link.download = fileName + "test.csv";
 
    //this part will append the anchor tag and remove it after automatic click
    document.body.appendChild(link);
    link.click();
    document.body.removeChild(link);
}