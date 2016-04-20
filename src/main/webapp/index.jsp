<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>内部管理系统</title>
</head>
<body>
    <title>内部管理系统-登录</title>
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/color.css">
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.6.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
</head>
<body">

	<div style="width:100%;padding-left:30%;">
	
	    <div id="p" class="easyui-panel" title="内部管理系统-登录" style="width:500px;height:200px;padding:10px;background:#fafafa;" 
	    data-options="iconCls:'icon-save'">
	        <div class="ftitle">User Information</div>
	        <form id="fm" method="post" novalidate action="index">
	            <div class="fitem">
	                <label>用户:</label>
	                <input name="username" class="easyui-textbox" required="true">
	            </div>
	            <div class="fitem">
	                <label>密码:</label>
	                <input name="password" class="easyui-textbox" required="true">
	            </div>
	            <div class="fitem">
	                <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="login()" style="width:90px">登录</a>
	            </div>
	            
	
	        </form>
	    </div>
	</div>
    <script type="text/javascript">
        var url;
        function login(){
            $('#fm').submit();
        }
    </script>
    <style type="text/css">
        #fm{
            margin:0;
            padding:10px 30px;
        }
        .ftitle{
            font-size:14px;
            font-weight:bold;
            padding:5px 0;
            margin-bottom:10px;
            border-bottom:1px solid #ccc;
        }
        .fitem{
            margin-bottom:5px;
        }
        .fitem label{
            display:inline-block;
            width:80px;
        }
        .fitem input{
            width:160px;
        }
    </style>
</body>
</html>