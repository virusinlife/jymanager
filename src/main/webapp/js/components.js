
function initdlg_userlist(listname, action, toolbar)
{
    $(listname).datagrid({
        url:action,
        rownumbers:true,
        singleSelect:true,
        method:'get',
        toolbar:toolbar,
        pagination:true,
        columns:[[
    		{field:'id',title:'id',width:100},
    		{field:'name',title:'Name',width:100},
    		{field:'password',title:'password',width:100,align:'right'}
        ]]
    });
    

}

function initpaging(dg)
{
    var opts = dg.datagrid('options');
	var pager = dg.datagrid('getPager');
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