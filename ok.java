<html>
<head>
<script language ="javascript">
function ok()
{
var a = document.f1.b1.value;
if(a == "OK")
document.f1.b1.value = "KO"
else
document.f1.b1.value = "OK"
}
</script>
</head>
<body>
<form name = "f1" method = "post">
<Input type = "button" name = "b1" value = "OK" onClick = "ok()">
</form>
</body>
</html>