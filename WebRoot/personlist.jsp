<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="import.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<script type="text/javascript">
    $(function() {
        $('#mydatagrid').datagrid({
            title : '用户实例',
            iconCls : 'icon-ok',
            width : 600,
            pageSize : 5,//默认选择的分页是每页5行数据
            pageList : [ 5, 10, 15, 20 ],//可以选择的分页集合
            nowrap : true,//设置为true，当数据长度超出列宽时将会自动截取
            striped : true,//设置为true将交替显示行背景。
            collapsible : true,//显示可折叠按钮
            toolbar:"#tb",//在添加 增添、删除、修改操作的按钮要用到这个
            url:'<%=request.getContextPath() %>/person!getAll.action',//url调用Action方法
            loadMsg : '数据装载中......',
            singleSelect:true,//为true时只能选择单行
            fitColumns:true,//允许表格自动缩放，以适应父容器
            //sortName : 'xh',//当数据表格初始化时以哪一列来排序
            //sortOrder : 'desc',//定义排序顺序，可以是'asc'或者'desc'（正序或者倒序）。
            remoteSort : false,
             frozenColumns : [ [ {
                field : 'ck',
                checkbox : true
            } ] ],
            pagination : true,//分页
            rownumbers : true//行数
        });
         
    });
     
</script>
 
</head>
<body>
    <h2>
        <b>用户管理</b>
    </h2>
 
    <table id="mydatagrid">
       <thead>
            <tr>
                <th data-options="field:'id',width:100,align:'center'">id</th>
                <th data-options="field:'name',width:100,align:'center'">姓名</th>
                <th data-options="field:'phone',width:100,align:'center'">电话</th>
               
            </tr>
        </thead>
    </table>
    
</body>
</html>