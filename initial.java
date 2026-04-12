<html><head>
<script language = "javascript">
function initials()
{
var a = new String(document.f1.text1.value);
var b = new String(document.f1.text2.value);
var c = new String(document.f1.text3.value);
document.write(a.charAt(0) + ".");
document.write(b.charAt(0) + ".");
document.write(c.charAt(0) + ".");
}
</script>
</head>
<body>
<form name = "f1" method = "post">
First Name:<input type = "text" name = text1>
Middle Name:<input type = "text" name = text2>
Last Name:<input type = "text" name = text3> 
<br>
<input type = "button" name = "b1" value= "DISPLAY" onClick = "initials()">
</form>
</body>
</html>
