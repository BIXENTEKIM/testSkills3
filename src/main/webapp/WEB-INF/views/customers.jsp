<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value='/libs/css/bootstrap.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/libs/css/bootstrap-grid.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/libs/css/bootstrap-reboot.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/libs/css/datatables.min.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/customer.css' />">

    <script type="text/javascript" src="<c:url value="/libs/js/jquery-3.5.0.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/libs/js/datatables.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/libs/js/bootstrap.js"/>"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js"></script>

</head>

<body>
 <div class="x_panel">
     <div class="x_title" >
         <h1>CUSTOMERS LISTING</h1>
     </div>


     <button id="btn-add-prs" class="btn btn-info pull-right">NEW</button>
     <div class="cutom-container">

 <table id="example" class="table table-hover table-bordered" style="width:100%">
    <thead>
    <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Gender</th>
        <th>Age</th>
        <th>Date Of Birth</th>
        <th>Date Created</th>
        <th width="5%"></th>
        <th width="5%"></th>
    </tr>
    </thead>
</table>
     </div>
 </div>
<script type="text/javascript" src="<c:url value="/javascript/customer.js"/>"></script>

 <%--<table id="example" class="display" style="width:100%">--%>
 <%--    <thead>--%>
 <%--    <tr>--%>
 <%--        <th>Name</th>--%>
 <%--        <th>Position</th>--%>
 <%--        <th>Office</th>--%>
 <%--        <th>Extn.</th>--%>
 <%--        <th>Start date</th>--%>
 <%--        <th>Salary</th>--%>
 <%--    </tr>--%>
 <%--    </thead>--%>
 <%--</table>--%>
<%--<script type="text/javascript" src="<c:url value="/javascript/customer.js"/>"></script>--%>

</body>
</html>

<%--<jsp:include page="../modals/prospectmodals.jsp"></jsp:include>--%>