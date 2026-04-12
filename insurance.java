<html>
<head>
<script language="javascript">
function chk()
{
document.fgColor = "black"
document.bgColor = "gray"
var m = prompt("Do you have a valid driving license?(y/n)");
if(m == "y")
{
var s = prompt("Enter the Gender(m/f):");
if(s == "m")
{
var a = prompt("Enter age in years:");
a = parseInt(a);
if(a>18)
alert("Candidate is selected!");// Male Driver more than 18 are seleted
 else
alert("Candidate is not selected!");
}
else if(s == "f") {
var a = prompt("Enter age in years:");
a = parseInt(a);
if(a>21)
alert("Candidate is selected!"); // Female Driver more than 21 are selected
else
alert("Candidate is not selected!");
}
}
else
alert("Candidate is not selected!");
}
</script>
</head>
<body onLoad = "chk()">
</body>
</html>
