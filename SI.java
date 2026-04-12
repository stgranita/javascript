<html>
<title> S.I.</title> <head> 
<script language = "javascript">
function simple()
{
var SI = 0,p = 0,t = 0,r = 0;
p = prompt("Enter Principle:");
t = prompt("Enter Time:");
r = prompt("Enter Rate:");
SI = (parseInt(p) * parseInt(t) * parseInt(t))/100;
document.write("S.I. = " + SI);
}
</script>
</head>
<body onload = "simple()">
</body>
</html>
