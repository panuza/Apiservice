<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="../resources/bootstrap/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="container">


    <div class="col-lg-offset-4 col-lg-4" id="panel">
        <h2>Year and Title Of Film</h2>

        <form>

           <div class="group">
              <h1>Year:</h1> <br>  <br> 
                <span class="highlight"></span>
                <span class="bar">
                <label><h2>${year}</h2></label></span>
            </div>
<div class="group">
                <h1>Title:</h1>
                <span class="highlight"></span>
                <span class="bar"></span> <br>
                <label><h2>${title}</h2></label>
            </div>

           
            
        </form>

    </div>
</div>



</body>
</html>
