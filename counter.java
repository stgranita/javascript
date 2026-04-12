<html>
<head>
<script language = "javascript">
var cnt =1;
function strt()
{
document.f1.t1.value = cnt;
cnt++;
obj = window.setTimeout(strt,1000);
}
function stop()
{
window.clearTimeout(obj);
cnt = 1;
}
</script>
<body>
<form name =f1 method ="post">
<input type = "text" name = t1 size =4>
<input type = "button" name = b1 value= "START" onClick = "strt()">
<input type = "button" name = b2 value= "STOP" onClick = "stop()">
</form>
</body>
</html>