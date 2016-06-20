



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

function parseParam(param, key){
    var paramStr="";
    if(param instanceof String||param instanceof Number||param instanceof Boolean){
        paramStr+="&"+key+"="+encodeURIComponent(param);
    }else{
        $.each(param,function(i){
            var k = key==null?i:key+(param instanceof Array?"["+i+"]":"."+i);
            paramStr += '&' + parseParam(this, k);
        });
    }
    return paramStr.substr(1);
};


function ExportExcel(listname, action, datajson)
{
/*
	$(listname).datagrid({  
        url:action,  
        queryParams:datajson
    });
*/
    /*
 	var datas = $.ajax({  
        url: action,  
        type: "POST",  
        data:datajson,
        datatype: 'json',  
        cache: false,  
        error: function (XMLHttpRequest, textStatus, errorThrown) { alert("新增或更新记录失败！"); } ,
 		success: function(ret){
 			//console.log(ret);
 			console.log(ret.length);
 			
 			
 			
 			//var fso = new ActiveXObject("Scripting.FileSystemObject");
 			//var f1 = fso.createtextfile("c:\\test.xls",true);
 			//f1.Write(ret);
 			
 		    var aLink = document.createElement('a');
 		    var evt = document.createEvent("HTMLEvents");
 		    evt.initEvent("click", false, false);
 		    aLink.download = "export.xls";
 		    //aLink.href = "data:text/plain," + decodeURI(ret);
 		   aLink.href = "data:text/plain;base64," + (ret);
 		    //aLink.href = "http://localhost:8080/JYmanager/excel/export.xls";
 		    aLink.dispatchEvent(evt); 			
 		}
 	
 	});  
 	*/
	
	var url = action + "?" + parseParam(datajson);
	window.location.href=url;
	
	
	//console.log(datas);
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


