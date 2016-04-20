<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>内部管理系统</title>
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/color.css">
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.6.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
</head>
<body class="easyui-layout">
    <div data-options="region:'north',title:'',split:true" style="height:70px;padding:0px;">
    	<div sytle="width:80%;"><table style="width:100%;"><tr><td style="width:80%;"><h2>内部管理系统</h2></td><td>欢迎登录</td></tr></table> </div>
    	
    </div>
    <div data-options="region:'west',title:'功能栏',split:true" style="width:200px;">
    <div id="functree" class="easyui-accordion" style="width:99%;height:99%;padding:1px;">
	    <div title="预算管理">
	    </div>
	    <div title="外援管理">
	    </div>
	    <div title="采购管理">
	    </div>
	    <div title="个人信息">
	    </div>	    
	</div>
    </div>
    <div data-options="region:'center',title:''" style="padding:5px;background:#eee;">
		<table id="userdlg"></table>
    </div>
    
    <script type="text/javascript">
	    $('#userdlg').datagrid({
	        url:'datagrid_data.json',
	        columns:[[
	    		{field:'id',title:'id',width:100},
	    		{field:'name',title:'Name',width:100},
	    		{field:'password',title:'password',width:100,align:'right'}
	        ]]
	    });
    
    </script>
    
</body>

</html>