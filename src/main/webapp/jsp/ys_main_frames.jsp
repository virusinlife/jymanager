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
<body style="padding:0px 0px;">
	
	<table id="yslist"  style="padding:0px 0px;margin:0px;"></table>
	
    <div id="tb" style="padding:0px 0px;display: none;">
    	<table>
	    	<tr>
		    	<td colspan="5">
					<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:ys_add_init();">添加</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="javascript:ys_edit_init();">修改</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="javascript:ys_remove();">删除</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="javascript:ys_search();">查找</a>
		       	</td>
	       	</tr>
	       	<tr>
				<td>
					预算序号:<input class="easyui-textbox" id="ys_query_ys_id" style="width:100px;">
				</td>
				<td>
					预算类型:<input class="easyui-combobox" id="ys_query_ys_type" style="width:100px;"/>
				</td>
				<td>
					预算科目:<input class="easyui-combobox" id="ys_query_ys_name" style="width:100px;"/>
				</td>
				<td>
					二级科目:<input class="easyui-combobox" id="ys_query_ys_subname" style="width:100px;"/></div>
				</td>
				<td>
					子项名称:<input class="easyui-textbox" id="ys_query_item_name" style="width:100px;">
				</td>
			</tr>
			<tr>
				<td>
					所属年份:<input class="easyui-textbox" id="ys_query_item_year" style="width:100px;">
				</td>
				<td>
					子项类型:<input class="easyui-textbox" id="ys_query_item_type" style="width:100px;">
				</td>
				<td>
					采购方式:<input class="easyui-combobox" id="ys_query_item_buy_way" style="width:100px;"/>
				</td>
				<td>
					责任人:<input class="easyui-textbox" id="ys_query_item_own_user" style="width:100px;">
				</td>
				<td>
					是否生效:<input class="easyui-combobox" id="ys_query_isvalid" style="width:100px;"/>
				</td>
			</tr>
    	</table>
    </div>  
    
    <div id="ys_detail_dlg" closed="true" style="display: none;">
    	<table>
    		<tr>
		    	<td><label for="ys_detail_ys_id" style="display: inline-block;width:100px;">预算编号:</label><input class="easyui-validatebox" data-options="required:true" id="ys_detail_ys_id" style="width:200px;"/></td>
		   		<td><label for="ys_detail_ys_type" style="display: inline-block;width:100px;">预算类型:</label><input class="easyui-combobox" id="ys_detail_ys_type" style="width:200px;"/></td>
		    </tr>
    		<tr>
		    	<td><label for="ys_detail_ys_name" style="display: inline-block;width:100px;">预算科目:</label><input class="easyui-combobox" id="ys_detail_ys_name" style="width:200px;"/></td>
		    	<td><label for="ys_detail_ys_subname" style="display: inline-block;width:100px;">预算二级科目:</label><input class="easyui-combobox" id="ys_detail_ys_subname" style="width:200px;"/></td>
		    </tr>
    		<tr>
		    	<td><label for="ys_detail_item_name" style="display: inline-block;width:100px;">预算子项名称:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_name" style="width:200px;"/></td>
		   	 	<td><label for="ys_detail_item_type" style="display: inline-block;width:100px;">预算类型:</label><input class="easyui-combobox" id="ys_detail_item_type" style="width:200px;"/></td>
		    </tr>
    		<tr>
		    	<td><label for="ys_detail_item_year" style="display: inline-block;width:100px;">所属年份:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_year" style="width:200px;"/></td>
		    	<td><label for="ys_detail_item_buy_way" style="display: inline-block;width:100px;">采购方式:</label><input class="easyui-combobox" id="ys_detail_item_buy_way" style="width:200px;"/></td>
		    </tr>
    		<tr>
		    	<td><label for="ys_detail_item_tax" style="display: inline-block;width:100px;">税率%:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_tax" style="width:200px;"/></td>
		    	<td><label for="ys_detail_item_cur_amount" style="display: inline-block;width:100px;">当年预算:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_cur_amount" style="width:200px;"/></td>
		    </tr>
    		<tr>
			    <td><label for="ys_detail_item_next_amount" style="display: inline-block;width:100px;">次年预算:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_next_amount" style="width:200px;"/></td>
			    <td><label for="ys_detail_item_own_user" style="display: inline-block;width:100px;">预算责任人:</label><input  class="easyui-validatebox" data-options="required:true" id="ys_detail_item_own_user" style="width:200px;"/>		  </td>  		    		    		    		    		    
		    </tr>
    		<tr>
			    <td><label for="ys_detail_isvalid" style="display: inline-block;width:100px;">是否生效:</label><input class="easyui-combobox" id="ys_detail_isvalid" style="width:200px;"/></td>
    		</tr>
    		<tr>
    			<td colspan="2" align="center" >					
    				<a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:ys_save();">保存</a>
    			</td>
    		</tr>
    	</table>
    </div>
    
    
    
    
    
    <script type="text/javascript">
    $(document).ready(function(){
	    
	    //hidedlg('#ys_detail_dlg');
	    ys_list_init();
	    

	    init_combobox_option('#ys_detail_ys_type', 'ys_type', false,false);
	    init_combobox_option('#ys_detail_ys_name', 'ys_name', false,false);
	    init_combobox_option('#ys_detail_ys_subname', 'ys_subname', false,false);
	    init_combobox_option('#ys_detail_item_buy_way', 'item_buy_way', false,false);
	    init_combobox_option('#ys_detail_isvalid', 'isvalid', false,false);	    
	    init_combobox_option('#ys_detail_item_type', 'item_type', false,false);

	    
	    init_combobox_option('#ys_query_ys_type', 'ys_type', false,false);
	    init_combobox_option('#ys_query_ys_name', 'ys_name', false,false);
	    init_combobox_option('#ys_query_ys_subname', 'ys_subname', false,false);
	    init_combobox_option('#ys_query_item_buy_way', 'item_buy_way', false,false);
	    init_combobox_option('#ys_query_isvalid', 'isvalid', false,false);	 
	    init_combobox_option('#ys_query_item_type', 'item_type', false,false);
	    
	    init_dlg('#ys_detail_dlg', {'width':480});

	    
    });
    var iAddOrEdit = 0;
    function ys_list_init()
    {
	    init_list('#yslist', 't_ys', 'getAllTYs.do','#tb');
	    //init_list('#yslist', 't_ys', 'getTYsByID.do?ID=YS-201605130925000','#tb');
	    init_list_paging('#yslist');       	
    	
    }
    function ys_detail_dlg_clear()
    {
    	$("#ys_detail_dlg input[id^='ys_detail_']").each(function()
    	{
    		key=$(this);
    		//console.log(key);
    		var className = key.attr("class");

    		if(typeof(className) == 'undefined') return ;
    		
    		if(className.indexOf("combobox") >= 0)
   			{
    			key.combobox('setValues', '');
        		//console.log("find combobox");
        	}
    		else if(className.indexOf("validatebox") >= 0)
   			{
    			key.val('');
        		//console.log("find textbox");
   			}
    		//console.log(key+" end");    		
    	});
    }
    
    
    function ys_add_init()
    {
    	iAddOrEdit = 1;
    	ys_detail_dlg_clear();
    	show_dlg('#ys_detail_dlg');
    }

    function ys_save()
    {

    	var datajson = {};
    	var tmp;
    	$("#ys_detail_dlg input[id^='ys_detail_']").each(function()
    	    	{
    	    		key=$(this);
   
    	    		var className = key.attr("class");

    	    		if(typeof(className) == 'undefined') return ;

     	    		console.log(key.attr("id") + className);
     	    		
     	    		var keyrealid = key.attr("id").replace("ys_detail_","");
     	    		
    	    		if(className.indexOf("combobox") >= 0)
    	   			{
    	    			datajson[keyrealid] = key.combobox('getValues')[0];
    	    			
    	        		//console.log("find combobox");
    	        	}
    	    		else if(className.indexOf("validatebox") >= 0)
    	   			{
    	    			datajson[keyrealid] = key.val();
    	        		//console.log("find textbox" + key.val());
    	   			}
    	    		//console.log(key+" end");    		
    	    	});
    	console.log(datajson);
    	var surl="";
    	if(iAddOrEdit == 1)
    	{
    		surl="insertTYs.do";
    	}
    	else
    	{
    		surl="updateTYsByID.do";
    	}    	
     	var datas = $.ajax({  
             url: surl,  
             type: "POST",  
             data:datajson,
             datatype: 'json',  
             cache: false,  
             error: function (XMLHttpRequest, textStatus, errorThrown) { alert(XMLHttpRequest.readyState); }  
         });   
     	console.log(datas);
     	
     	
    	iAddOrEdit = 0;
    }
  
    function ys_edit_init()
    {
    	iAddOrEdit = 2;
    	var row = $('#yslist').datagrid('getSelected');
    	var datas = $.ajax({  
            url: "getTYsByID.do?ID="+row.ys_id,  
            type: "GET",  
            async: false,  
            cache: false,  
            error: function (XMLHttpRequest, textStatus, errorThrown) { alert(XMLHttpRequest.readyState); }  
        });

    	data=$.parseJSON(datas.responseText)[0];
    	//console.log(datas.responseText);
    	//console.log(data);
    	for (var key in data)
    	{
    		//if(typeof(data[key]) == 'function') continue;
    		//console.log(key+typeof(data[key]));
    		var className = $('#ys_detail_'+key).attr("class");

    		if(typeof(className) == 'undefined') continue;
    		
    		if(className.indexOf("combobox") >= 0)
   			{
        		$('#ys_detail_'+key).combobox('setValues', data[key]);
        		//console.log("find combobox");
        	}
    		else if(className.indexOf("validatebox") >= 0)
   			{
        		$('#ys_detail_'+key).val(data[key]);
        		//console.log("find textbox");
   			}
    		//console.log(key+" end");
    	}
    	//console.log("end for");
    	
    	show_dlg('#ys_detail_dlg');   	
    }
    function ys_remove()
    {
    	
    }

    function ys_search()
    {
    	
    }
    </script>
    
</body>

</html>