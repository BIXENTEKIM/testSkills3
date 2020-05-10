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


<%--    <!-- DataTables CSS -->--%>
<%--    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">--%>

<%--    <!-- jQuery -->--%>
<%--    <script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.3.1.js"></script>--%>

<%--    <!-- DataTables -->--%>
<%--    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>--%>


    <script type="text/javascript" src="<c:url value="/libs/js/jquery-3.5.0.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/libs/js/datatables.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/libs/js/bootstrap.js"/>"></script>

</head>

<body>

<%--<div class="x_panel">--%>
<%--    <div class="x_title">--%>
<%--        <h4>Customers </h4>--%>
<%--        <button id="btn-add-prs" class="btn btn-info pull-right">New</button>--%>
<%--    </div>--%>
<%--</div>--%>
<%--    <div class="cutom-container">--%>
<%--        <table id="tenTbl" class="table table-hover table-bordered">--%>
<%--            <thead>--%>
<%--            <tr>--%>
<%--                <th>Prospect ID</th>--%>
<%--                <th>Name</th>--%>
<%--                <th>ID Number</th>--%>
<%--                <th>Phone</th>--%>
<%--                <th>Prospect Type</th>--%>
<%--                <th>Date of Birth</th>--%>
<%--                <th>Status</th>--%>
<%--                <th>Category</th>--%>
<%--                <th>Branch</th>--%>
<%--                <th>Sub Agent</th>--%>
<%--                <th>Comment</th>--%>
<%--                <th width="5%"></th>--%>
<%--                <th width="5%"></th>--%>
<%--            </tr>--%>
<%--            </thead>--%>
<%--        </table>--%>
<%--    </div>--%>


<table id="example" class="display" style="width:100%">
    <thead>
    <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>Extn.</th>
        <th>Start date</th>
        <th>Salary</th>
    </tr>
    </thead>
    <tfoot>
    <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>Extn.</th>
        <th>Start date</th>
        <th>Salary</th>
    </tr>
    </tfoot>
</table>
<script type="text/javascript" src="<c:url value="/javascript/customer.js"/>"></script>
</body>
</html>

<%--<jsp:include page="../modals/prospectmodals.jsp"></jsp:include>--%>