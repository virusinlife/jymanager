


function initdlg_list(listname, columntype, action, toolbar)
{
	var columns = $.ajax({  
        url: "getTableColumnsByTableName.do?tablename="+columntype,  
        type: "GET",  
        async: false,  
        cache: false,  
        error: function (XMLHttpRequest, textStatus, errorThrown) { alert(XMLHttpRequest.readyState); }  
    });  
	
	var columns_str = $.parseJSON(columns.responseText);
	console.log(columns_str);

	var datas = $.ajax({  
        url: action,  
        type: "GET",  
        async: false,  
        cache: false,  
        error: function (XMLHttpRequest, textStatus, errorThrown) { alert(XMLHttpRequest.readyState); }  
    });  
	var datas_str = $.parseJSON(datas.responseText);
	console.log(datas_str);	
	
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


function initdlg_paging(dg)
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