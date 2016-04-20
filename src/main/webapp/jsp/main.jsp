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
</head>
<body class="easyui-layout">
    <div data-options="region:'north',title:'',split:true" style="height:70px;padding:0px;">
    	<div sytle="width:80%;"><table style="width:100%;"><tr><td style="width:80%;"><h2>内部管理系统</h2></td><td>欢迎登录</td></tr></table> </div>
    	
    </div>
    <div data-options="region:'west',title:'功能栏',split:true" style="width:200px;">
    <div id="functree" class="easyui-accordion" style="width:99%;height:99%;padding:1px;">
	    <div title="预算管理">
	    	<a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="click_whf()" style="width:90px">维护费</a>
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
		<div id="tt" class="easyui-tabs" style="width:100%;">
	  
	    </div>
	
    </div>

    <script type="text/javascript">
	    
		function click_whf(url)
		{
			var content = '<iframe scrolling="auto" frameborder="0"  src="ys_whf_frames.do" style="width:95%;height:500px;"></iframe>';
			$('#tt').tabs('add',{
	            title: '维护费管理',
	            content: content,
	            closable: true
	        });
			
		}
    
    </script>
    
</body>

</html>