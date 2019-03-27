<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sample</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<link rel="stylesheet" href="/webjars/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="/webjars/jquery/3.3.1-2/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<script type="text/javascript">
$(document).ready(function() {
	$("#selectAllBtn").click(function(){
		$.ajax({
			url: "sampleAllList",
			type : "GET",
			contentType:"application/json",
			data : {
			},
			success : function(data){
				
			}
		});
	});
	
	$("#addBtn").click(function(){
		$.ajax({
			url: "sampleAdd",
			type : "POST",
			data : {
				sampleId : $("#sampleId").val(),
				sampleName : $("#sampleName").val(),
				sampleDesc : $("#sampleDesc").val(),
				
			},
			success : function(data){
				
			}
		});
	});
	
	
});
</script>
<body>
<div>
	<input type="button" id="selectAllBtn" value="selectAll"/>
</div>
<div>
	<input type="text" id="selectId" value=""/>
	<input type="button" id="selectIdBtn" value="selectId"/>
</div>
<div>
	<input type="text" id="selectId" value=""/>
	<input type="button" id="selectIdBtn" value="selectId"/>
</div>
<div>
	<input type="text" id="sampleId" value=""/>
	<input type="text" id="sampleName" value=""/>
	<input type="text" id="sampleDesc" value=""/>
	<input type="button" id="addBtn" value="add"/>
</div>
<div>
	<input type="text" id="deleteId" value=""/>
	<input type="button" id="deleteIdBtn" value="deleteId"/>
</div>
</body>
</html>