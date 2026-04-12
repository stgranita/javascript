<html>
<script language = "javascript">
function add()
{
var no1 = document.f1.t1.value; 
var no2 = document.f1.t2.value;
var no3 = document.f1.t3.value;
alert(no1+no2+no3 + " is the concatenated string.");
}
</script>
<body>
<form name = "f1">
<Enter no1:><input type = "text" name = "t1">
<Enter no2:><input type = "text" name = "t2">
<Enter no3:><input type = "text" name = "t3">
<input type = "button" name = "b1" value = "CONCAT" onClick = "add()">
</form></body>
</html>