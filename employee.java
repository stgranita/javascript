<html>
<head>
<title>Employee Details</title>
<script language = "javascript">
function chk_emp()
{
var a,b,c,gen;
a = document.f1.t1.value;
b = document.f1.t2.value;
c = document.f1.t3.value;
if(a =="")
{
alert("Please enter employee ID!");
document.f1.t1.focus(); }
if(b == "")
{
alert("Please enter employee name!");
document.f1.t2.focus(); }
if(c == "")
{
alert("Please enter employee address!");
document.f1.t3.focus(); }
if(document.f1.elements[5].checked == true)
gen = document.f1.elements[5].value;
else
gen = document.f1.elements[6].value;
if(gen == "on")
{
document.bgcolor = "black";
document.fgcolor = "Blue";
}
}
function chk_char(a)
{
if(!isNaN(a))
{
alert("Invalid Employee name!");
document.f1.t2.value = "";
document.f1.t2.focus();}
}
function chk_num1(a)
{
if(isNaN(a))
{
alert("Invalid Employee ID!");
document.f1.t1.value = "";
document.f1.t1.focus();}
}
function chk_num2(a)
{
if(isNaN(a))
{
alert("Invalid Phone number!");
document.f1.t4.value = "";
document.f1.t4.focus();}
}
</script>
</head>
<body bgcolor= "gray">
<marquee behaviour = alternate>EMPLOYEE DETAILS</marquee><hr color = "red">
<form name = "f1" method = "post">
Employee ID:<input type = "text" name = t1 size = 2>
Employee Name:<input type = "text" name = t2 size = 10 onFocus = "chk_num1(t1.value)"><br><br>
Employee Address:<textarea name = t3 rows = 5 cols = 20 onFocus ="chk_char(t2.value)"></textarea><br><br>
Employee Phone No:<input type = "text" name = t4 size = 10 ><br><br>
Department Name:<select name = s onFocus="chk_num2(t4.value)" onChange = "">
<option value = "Production">Production</option>
<option value = "Maintenance">Maintenance</option>
<option value = "Finance">Finance</option>
<option value = "Sales">Sales</option>
<option value = "Purchase">Purchase</option>
</select><br><br>
Gender:<input type = "radio" name = r1.value = "Male" checked>Male
<input type = "radio" name = r1.value = "Female">Female<br><br>
<input type = "button" name=b1 value="SUBMIT" onClick = "chk_emp()">
</form></body></html>

