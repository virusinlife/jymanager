



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
    //$(listname).datagrid('load',datajson);	
    
    
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

function ExportExcel(columns,datas){//读取表格中每个单元到EXCEL中 
	try
	{
		var oXL; 
		try 
		{ 
			oXL = GetObject("", "Excel.Application"); 
		} 
		catch (E) 
		{ 
			try 
			{ 
				oXL = new ActiveXObject("Excel.Application"); 
			} 
			catch (E2) 
			{ 
				alert("请确认:\n1.机器上Excel已经安装.\n2.Internet 选项=>安全=>Internet \"对没有标记为安全的ActiveX控件进行初始化和脚本运行，设定为启用\"");
				return; 
			} 
		}		

		var oWB = oXL.Workbooks.Add(); //获取workbook对象 
		var oSheet = oWB.ActiveSheet; //激活当前sheet 
		var colrows = columns.length;
		var datarows = datas.length; //取得表格行数 
		
		for (j = 0; j < colrows; j++){ 
			oSheet.Cells(1, j + 1).value = columns[j]; //赋值 
		} 	
		
		for (i = 0; i < datarows; i++){ 
			var lenc = datas[i].length; //取得每行的列数 
			for (j = 0; j < lenc; j++){ 
				oSheet.Cells(i + 2, j + 1).value = datas[i][j]; //赋值 
			} 
		} 
		oXL.Visible = true; //设置excel可见属性 
	}
	catch(e)
	{
		alert(e.message);
	}

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