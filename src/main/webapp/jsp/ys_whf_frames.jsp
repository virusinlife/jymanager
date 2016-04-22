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
	
    <div id="tb" style="padding:2px 5px;">
        <a href="#" class="easyui-linkbutton" iconCls="icon-search">Search</a>
    </div>  
    
    <div id="ys_detail_dlg">
		    <div>
				<label for="ys_type">type:</label>
				<input class="easyui-combobox" id="ys_detail_ys_type"/>
		    </div>		    
    
    </div>
    
    
    
    
    
    <script type="text/javascript">
    $(document).ready(function(){
	    
	    //hidedlg('#ys_detail_dlg');
	    
	    
	    init_list('#yslist', 't_ys', 'getAllTYs.do','#tb');
	    init_list_paging('#yslist');    
	    init_combobox_option('#ys_detail_ys_type', 'ys_type', true,false);
	    init_dlg('#ys_detail_dlg');
    });
    </script>
    
</body>

</html>