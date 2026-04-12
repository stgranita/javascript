<html>
<head>
<script language = "javascript">
function change()
{
var name = new String(document.f1.t1.value);
var n = name.toUpperCase();
document.f1.t1.value = n; }
function change1()
{
var name = new String(document.f1.t1.value);
var n = name.toLowerCase();
document.f1.t1.value = n; }

</script>
</head>
<body>
<form name = "f1" method = "post">
<input type = "text" name = t1> <br>
<input type = "button" name = b1 value = "UPPER CASE" onClick = "change()"> <br>
<input type = "button" name = b2 value = "LOWER CASE" onClick = "change1()"> <br>
</form> 
</body>
</html>


