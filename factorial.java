<html>
<head>
<script language = "javascript">
function fact()
{
var p,a=1;
p = prompt("Enter a number:");
p = parseInt(p);
while(p > 0)
{a = a * p; p = p-1;}
document.write("Factorial is:" + a);
}
</script>
</head>
<body onLoad = "fact()"></body></html>