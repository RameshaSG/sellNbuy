<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta http-equiv="Pragma" content="no-cache">
	<meta http-equiv="Cache-Control" content="no-cache">
	<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
	<title>SmartWay | Home</title>
	<link href="static/css/bootstrap.min.css" rel="stylesheet">
	<link href="static/css/style.css" rel="stylesheet">

	<script type="text/javascript">
		function showAlert() {
			alert("Successfully added");
		}

	</script>

	<script src="js/validation.js" type="text/javascript"></script>
</head>

<body style="background-image:url(/static/images/aaa.jpg) ">

	<c:choose>
		<c:when test="${mode=='MODE_ADDPAYMENT' }">
			<div class="container">
				<h2>Horizontal form</h2>
				<form action="http://localhost:8080/payments" method="POST">
					<div class="form-group">
						<label for="pid">Payment ID:</label>
						<input type="text" class="form-control" id="paymentid" placeholder="Enter Payment ID" name="id">
					</div>

					<div class="form-group">
						<label for="oid">Order ID:</label>
						<input type="text" class="form-control" id="orderid" placeholder="Enter Order ID"
							name="orderid">
					</div>

					<div class="form-group">
						<label for="cid">Payment Method:</label>
						<input type="text" class="form-control" id="method" placeholder="Payment Method" name="method">
					</div>

					<div class="form-group">
						<label for="sid">Amount</label>
						<input type="number" class="form-control" id="amount" placeholder="Amount" name="amount">
					</div>

					<div class="form-group">
						<label for="amt">Date</label>
						<input type="date" class="form-control" id="date" placeholder="Date" name="date">
					</div>
					<button type="submit" class="btn btn-primary" onclick="">Submit</button>
				</form>
			</div>
			<hr>
		</c:when>
	</c:choose>

	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<jsp:include page="footer.jsp" />
</body>

</html>