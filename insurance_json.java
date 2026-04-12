<html>
<head>
<script language="javascript">
var interviewee = [{
        "licensed": true,
        "gender": "Male",
        "age": 19
        }, {"licensed": true,
        "gender": "Female",
        "age": 22}];
function chk()
{
 document.fgColor = "black"
 document.bgColor = "gray"
 if (interviewee[0].age >= 18 && interviewee[0].gender == "Male" && interviewee[0].licensed)
 console.log("Selected for Interview!");
else if (interviewee[1].age >= 21 && interviewee[0].gender == "Female" && interviewee[0].licensed)
  console.log("Selected for Interview!");
else
  console.log("Candidate is NOT selected!");
}
</script>
</head>
<body onLoad = "chk()">
</body>
</html>
