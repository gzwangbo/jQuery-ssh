<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="import.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
    <title>LayOut</title>
    <script type="text/javascript">
   
   function addTab(tabId,title,url){

    	//如果当前id的tab不存在则创建一个tab
    	if($("#"+tabId).html()==null){
    		var name = 'iframe_'+tabId;
    		$('#centerTab').tabs('add',{
    			title: title,         
    			closable:true,
    			cache : false,
    			//注：使用iframe即可防止同一个页面出现js和css冲突的问题
    			content : '<iframe name="'+name+'"id="'+tabId+'"src="'+url+'" width="100%" height="100%" frameborder="0" scrolling="auto" ></iframe>'
    		});
    	}
    }
    
    </script>
  
</head>
<body>
    <div class="easyui-layout" style="width:auto;height:600px;">
        <div region="north" border="false" style="overflow:hidden;height:60px;background:#A4BED4;">
            <h2>Border布局</h2>
        </div>
        <div region="south" split="true" style="height:50px;background:#efefef;">
        </div>
        <div region="east" icon="icon-reload" title="Menu2" split="true" style="width:180px;">
        </div>
        <div region="west" split="true" title="Menu1" style="width:150px;">
          <div id="aa" class="easyui-accordion" fit="true" style="width:145px;height:auto;">
          
          <div title="菜单" style="overflow:auto;padding:10px;">
                 <ul>
                  <li><a href="javascript:addTab('index','用户列表','personlist.jsp')">用户</a></li>
                   
                 </ul>
            </div>
          
          
          <% for(int i=0;i<3;i++){
        	  
          %>
            <div title="Title<%=i %>" style="overflow:auto;padding:10px;">
                <h3>Accordion<%=i %></h3>
            </div>
            
           <% }%>
        </div>
       
         
            
            
      
        </div>
        <div region="center" title="内容"  style="background:#eee;">
        <div class="easyui-tabs" id="centerTab" fit="true" style="overflow:hidden;" >   
                <div  title="欢迎页"  >  
                    <h3>你好，欢迎系统</h3>  
                </div>  
            </div>  
        </div>
    </div>
</body>
</html>