<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>商品查询页面</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css"/>
</head>
<body>
<a href="${pageContext.request.contextPath}/query.jsp" target="work">搜索商品</a><br/>
<a href="${pageContext.request.contextPath}/productAction.do?method=list" target="work">列出商品</a><br/>
<a href="${pageContext.request.contextPath}/categoryAction.do?method=list" target="work">列出类别</a><br/>
<a href="${pageContext.request.contextPath}/productAction.do?method=tosave" target="work">新增商品</a><br/>
<a href="${pageContext.request.contextPath}/category/save.jsp" target="work">新增类别</a><br/>
</body>
</html>