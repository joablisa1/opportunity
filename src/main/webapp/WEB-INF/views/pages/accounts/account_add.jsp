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
                                <h5 class="m-0  font-weight-lighter text text-primary"> Add Account</h5>
                            </div>
                            <div class="card-body">
                                <form:form action="${pageContext.request.contextPath}/account/save" method="post" modelAttribute="accountForm">
                                    <form:hidden path="id"/>
                                    <div class="col-md-8">
                                        <div class="form-group">
                                            <label class="small mb-1" for="accountName">Account Name:</label>
                                            <form:input path="accountName" required="required" class="form-control" placeholder="Enter Account Name.." />
                                        </div>
                                    </div>
                                    <div class="col-md-8">
                                        <div class="form-group">
                                            <label class="small mb-1" for="amount">Amount</label>
                                            <form:input path="amount" required="required" class="form-control" placeholder="Enter  amount" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="customer_id" class="col-sm-2 col-sm-2 control-label">Customer ID:</label>
                                        <div class="col-sm-8">
                                            <form:select id="customer_id" name="customer_id" class="form-control" required="required" path="customer_id">
                                                <form:option value=""> Select customer_id</form:option>
                                                <c:forEach items="${customerList}" var="customer">
                                                    <form:option value="${customer.id}"> ${customer.id}
                                                    </form:option>
                                                </c:forEach>

                                            </form:select>
                                        </div>
                                    </div>

                                    <button class="btn btn-outline-primary btn-sm">Add</button>
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
