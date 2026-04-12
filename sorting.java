<html>
<head>
<script language = "javascript">
function mergeAndFilterObjects()
{
//    var i,j, name1,id1,age1,name2, id2, age2, len1, len2,name3, age3, id3,cnt=0;
//    len1 = prompt("Enter No. of elements in 1st Array");
//    len1 = parseInt(len1);
//    name1 = new Array(len1); id1 = new Array(len1); age1 = new Array(len1);
//    //name3 = new Array(len1); id3 = new Array(len1); age3 = new Array(len1);
//    for(i=0;i<len1;i++)
//    {
//        id1[i] = prompt("Enter id for Array1:");
//        name1[i] = prompt("Enter name for Array1:");
//        age1[i] = prompt("Enter age for Array1:");
//        id1[i] = parseInt(id1[i]);
//    }
//    len2 = prompt("Enter No. of elements in 2nd Array");
//    len2 = parseInt(len2);
//    name2 = new Array(len2); id2 = new Array(len2);age2 = new Array(len2);
//    for(j=0;j<len2;j++)
//    {
//        id2[j] = prompt("Enter id for Array2:");
//        name2[j] = prompt("Enter name for Array2:");
//        age2[i] = prompt("Enter age for Array2:");
//        id2[i] = parseInt(id2[i]);
//
//    }
const oldData = [
    { id: 1, name: 'Alice', age:30 },
    { id: 2, name: 'Bob', age: 25 },
    { id: 3, name: 'Robert' },
];

const newData = [
    { id: 2, name: 'Bob', age: 25 },
    { id: 4, name: 'Charlie', age: 20 },
    { id: 5, name: 'Jim', age: 40 },
];

const usersMap = new Map();

    oldData.forEach(user => usersMap.set(user.id, user));

    newData.forEach(user => {
  const exists = usersMap.has(user.id);

    if (!exists) {
        usersMap.set(user.id, user);
    }
})

    usersMap.forEach(user => console.log(user))

}
</script>
</head>
<body>
<form name = f1 method = "post">
<input type = "button" name = b1 value = "SORT" onClick = "mergeAndFilterObjects()">
</form>
</body>
</html>