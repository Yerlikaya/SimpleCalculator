<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Calculator</title>
    </head>

    <body>
        <div class="row">
            <div class="container">
                <div class="col-lg-6 col-lg-offset-3">
                    <div class="form-row">

                        <input id="value1" type="number">
                        <select id="operation">
                            <option value="+">+</option>
                            <option value="-">-</option>
                            <option value="*">*</option>
                            <option value="/">/</option>
                        </select>
                        <input id="value2" type="number">
                        <button id="calculate" class="btn btn-primary">Calculate</button>
                    <div id="result" class="text-center col-lg-9"><h2>Result</h2></div>
                </div>
            </div>
        </div>
    </body>
    
    <script type="text/javascript">

        $('#calculate').click(function(){
		var val1=$('#value1').val();
		var val2=$('#value2').val();
		var oprtn= $('#operation').val();
			if(val1!="" && val2!="")
                            $.post("/calculate",
                               {
                                   value1: val1,
                                   value2: val2,
                                   operation: oprtn
                               },
                           function(data){
                                   $('#result h2').text(data);
                            });
                });
				
    </script>
</html>