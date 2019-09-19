
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path=pageContext.getServletContext().getContextPath();
	path=path+"/";
	System.out.println(path+"，路径。。。。。");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%-- <base href="<%=path%>"> --%> 
<title>后台</title>
			<link rel="stylesheet"  type="text/css" href="easyui/css/easyui.css" /> 
			<link rel="stylesheet"  type="text/css" href="easyui/css/icon.css" />
			<script type="text/javascript" src="easyui/js/jquery.min.js"></script>
			<script type="text/javascript" src="easyui/js/jquery.easyui.min.js" ></script>
			<script type="text/javascript" src="easyui/js/easyui-lang-zh_CN.js" ></script>
<style type="text/css">
ul{
list-style:none;
width:150px;
margin:0px;
}
li{
width:148px;
margin-bottom:6px;
}
</style>

</head>
<body class="easyui-layout">
     <div data-options="region:'north'" style="height:100px;"></div>
    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>
    <div data-options="region:'east',title:'East',split:true" style="width:100px;"></div>
    <div data-options="region:'west',title:'导航菜单'" style="width:200px;">
     	<div id="aa" class="easyui-accordion" data-options="fit:true" style="width:300px;height: 200px;">
     		
     		<!-- 商家处理的超链接 -->
     		<div title="商品管理">
     		<ul>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="page/addgood.html">管理员信息</a></li>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="page/showgood.html">添加管理员</a></li>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="">会员信息</a></li>
    		</ul>
     		</div>
     		<div title="套餐管理" style="padding: 10px">
     		<ul>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/addgroupbuy.html">添加套餐信息</a></li>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/findgroupbuy.html">浏览套餐信息</a></li>
    		</ul>
     		</div>
     		<div title="订单管理" style="padding: 10px">
     		<ul>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/scanorder.html">浏览订单信息</a></li>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/refundinfo.html">退款订单信息</a></li>
    		</ul>
     		</div>
     		<div title="商家中心" style="padding: 10px">
     		<ul>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/sellerinfo.jsp">个人信息</a></li>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/alterpwd.html">修改密码</a></li>
    		</ul>
     		</div>
     	
     	
     		<!-- 商家处理的超链接 -->
     		<div title="类型管理" data-options=selected:true>
     		<ul>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/goodtype.html">商品类型信息</a></li>    		</ul>
	     	</div>
	     	<div title="商家管理">
     		<ul>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/scanorder.html">浏览套餐信息</a></li>
    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/scanseller.html">浏览商家信息</a></li>
    		</ul>
     		</div>
	     	
	     	<div title="用户管理">
	     		<ul>
	    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/showadmin.html">浏览管理员信息</a></li>
	    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/powermanage.html">权限管理</a></li>
	    			<li><a class="easyui-linkbutton btn" data-options="plain:true" href="back/manager/sellermanage.html">商家管理</a></li>
	    		</ul>
	     	</div>
     		
     		
     	
     	
     	
     	<div title="评论管理"  style="padding: 10px">
     	</div>
     	
     	</div>
    	
    </div>
   
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">
    	<div id="show_content" class="easyui-tabs" data-options="fit:true"></div>
    </div>
</body>
<script type="text/javascript">
$(function(){
	$('.btn').click(function(){
		var href=$(this).attr('href');
		var title=$(this).text();
		if(!$('#show_content').tabs('exists',title)){
			$('#show_content').tabs('add',{
				title:title,
				href:href,
				closable:true,
				tools:[{
					iconCls:'icon-mini-refresh',
					handler:function(){
						alert('refresh');
					}
				}]
			});
		}else{
			$('#show_content').tabs('select',title);
		}
		return false;
	});
});
</script>
</html>