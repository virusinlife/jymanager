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
	
	<table id="userlist"></table>
	
    <div id="tb" style="padding:2px 5px;">
        <a href="#" class="easyui-linkbutton" iconCls="icon-search">Search</a>
    </div>  
    <script type="text/javascript">
    	initdlg_userlist('#userlist', 'selectByExample.do','#tb');
    	initpaging('#userlist');
    </script>
    
</body>

</html>