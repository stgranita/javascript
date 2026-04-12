<html>
<script language = "javascript">
document.write("<h1> Welcome </h1><hr>");
function naming(a,b,c)
{
document.write("<center><h2>");
document.write(a + "</h2><Br><h2>");
document.write(b + "</h2><Br><h2>");
document.write(c + "</h2></center>");
}
</script>
<body>
<form name = "f1">
First Name:<input type = "text" name = "t1">
Middle Name:<input type = "text" name = "t2">
Last Name:<input type = "text" name = "t3">
<input type = "button" name = "b1" value = "SHOW" onClick = naming(t1.value,t2.value,t3.value)>
</form>
</body>
</html>