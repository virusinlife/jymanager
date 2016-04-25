<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>内部管理系统</title>
	<link rel="stylesheet" type="text/css" href="js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/easyui/themes/color.css">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>
	
	<script type="text/javascript" src="js/components.js"></script>
</head>
<body>
	
	<table id="yslist"></table>
	
    <div id="tb" style="padding:2px 5px;display: none;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:ys_add_init();">添加</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="javascript:ys_edit_init();">修改</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="javascript:ys_remove();">删除</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:ys_save();">保存</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="javascript:ys_search();">查找</a>
    </div>  
    
    <div id="ys_detail_dlg" closed="true" style="display: none;">
    	
		    <div><label for="ys_detail_id" style="display: inline-block;width:100px;">预算编号:</label><input class="easyui-validatebox" data-options="required:true" id="ys_detail_id" style="width:200px;"/></div>
		    <div><label for="ys_detail_ys_type" style="display: inline-block;width:100px;">预算类型:</label><input class="easyui-combobox" id="ys_detail_ys_type" style="width:200px;"/></div>
		    <div><label for="ys_detail_ys_name" style="display: inline-block;width:100px;">预算科目:</label><input class="easyui-combobox" id="ys_detail_ys_name" style="width:200px;"/></div>
		    <div><label for="ys_detail_ys_subname" style="display: inline-block;width:100px;">预算二级科目:</label><input class="easyui-combobox" id="ys_detail_ys_subname" style="width:200px;"/></div>
		    <div><label for="ys_detail_item_name" style="display: inline-block;width:100px;">预算子项名称:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_name" style="width:200px;"/></div>
		    <div><label for="ys_detail_item_year" style="display: inline-block;width:100px;">所属年份:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_year" style="width:200px;"/></div>
		    <div><label for="ys_detail_item_buy_way" style="display: inline-block;width:100px;">采购方式:</label><input class="easyui-combobox" id="ys_detail_item_buy_way" style="width:200px;"/></div>
		    <div><label for="ys_detail_item_tax" style="display: inline-block;width:100px;">税率%:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_tax" style="width:200px;"/></div>
		    <div><label for="ys_detail_item_cur_amount" style="display: inline-block;width:100px;">当年预算:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_cur_amount" style="width:200px;"/></div>
		    <div><label for="ys_detail_item_next_amount" style="display: inline-block;width:100px;">次年预算:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_next_amount" style="width:200px;"/></div>
		    <div><label for="ys_detail_item_own_user" style="display: inline-block;width:100px;">负责科室:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_own_user" style="width:200px;"/></div>		    		    		    		    		    		    
		    <div><label for="ys_detail_isvalid" style="display: inline-block;width:100px;">是否生效:</label><input class="easyui-combobox" id="ys_detail_isvalid" style="width:200px;"/></div>
    </div>
    
    
    
    
    
    <script type="text/javascript">
    $(document).ready(function(){
	    
	    //hidedlg('#ys_detail_dlg');
	    
	    
	    init_list('#yslist', 't_ys', 'getAllTYs.do','#tb');
	    init_list_paging('#yslist');    
	    init_combobox_option('#ys_detail_ys_type', 'ys_type', false,false);
	    init_combobox_option('#ys_detail_ys_name', 'ys_name', false,false);
	    init_combobox_option('#ys_detail_ys_subname', 'ys_subname', false,false);
	    init_combobox_option('#ys_detail_item_buy_way', 'item_buy_way', false,false);
	    init_combobox_option('#ys_detail_isvalid', 'isvalid', false,false);	    
	    
	    init_dlg('#ys_detail_dlg', {'width':700, 'height':500});
	    
	    
	    

	    
    });
    
    
    function ys_add_init()
    {
    	show_dlg('#ys_detail_dlg');
    }
    function ys_edit_init()
    {
    	show_dlg('#ys_detail_dlg');
    	
    	
    }
    function ys_remove()
    {
    	show_dlg('#ys_detail_dlg');
    }
    function ys_save()
    {
    	show_dlg('#ys_detail_dlg');
    }
    function ys_search()
    {
    	show_dlg('#ys_detail_dlg');
    }
    </script>
    
</body>

</html>