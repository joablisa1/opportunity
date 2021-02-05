<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lisa
  Date: 1/26/2021
  Time: 4:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link href="webjars/bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
    <link href="<c:url value="/static/css/styles.css"/>" rel="stylesheet">

</head>
<body class="sb-nav-fixed">
<%@include file="../navbars/header.jsp"%>
<div id="layoutSidenav">
    <div id="layoutSidenav_nav">
        <%@include file="../navbars/sidenav.jsp"%>
    </div>
    <div id="layoutSidenav_content">
        <main>
            <div class="container-fluid">
                <h1 class="mt-4">Dashboard</h1>
                <ol class="breadcrumb mb-4">
                    <li class="breadcrumb-item active">Dashboard</li>
                </ol>
                <div class="row">
                    <div class="col-sm-10">
                        <div class="card shadow-sm">
                            <div class="card-header py-3">
                                <h5 class="m-0  font-weight-lighter text text-primary"> Add Opportunity</h5>
                            </div>
                            <div class="card-body">
                                <form:form action="${pageContext.request.contextPath}/opportunity/save" method="post" modelAttribute="opportunityForm">
                                    <form:hidden path="id"/>
                                    <div class="col-md-8">
                                        <div class="form-group">
                                            <label class="small mb-1" for="opportunityName">Opportunity Name:</label>
                                            <form:input path="opportunityName"  required="required" class="form-control" placeholder="Enter opportunity Name.." />
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="customer_id" class="col-sm-2 col-sm-2 control-label">Stage:</label>
                                        <div class="col-sm-8">
                                            <form:select id="customer_id" name="customer_id" class="form-control" required="required" path="stage">
                                                <form:option value=""> Select stage Type</form:option>
                                                <c:forEach items="${stages}" var="stages">
                                                    <form:option value="${stages}"> ${stages}</form:option>
                                                </c:forEach>

                                            </form:select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="customer_id" class="col-sm-2 col-sm-2 control-label">Account Name:</label>
                                        <div class="col-sm-8">
                                            <form:select id="customer_id" name="customer_id" class="form-control" required="required" path="account_id">
                                                <form:option value=""> Select account Name</form:option>
                                                <c:forEach items="${accountList}" var="account">
                                                    <form:option value="${account.id}"> ${account.accountName}</form:option>
                                                </c:forEach>

                                            </form:select>
                                        </div>
                                    </div>

                                    <button class="btn btn-outline-primary btn-sm">Add Opportunity</button>
                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <%@include file="../navbars/footer.jsp"%>

    </div>
</div>
<script src="webjars/bootstrap/4.3.1/js/bootstrap.js"></script>
</body>
</html>
