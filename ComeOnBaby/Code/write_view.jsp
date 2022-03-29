<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Come On BABY</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
<meta charset="UTF-8">
<title>Document</title>
<script
	src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<style>
#wrapper {
	border: 2px solid salmon;
	border-radius: 5px;;
	width: 400px;
	height: 650px;
	margin: auto;
}
.title {
	text-align: center;
	font-size: 20px;
	font-weight: bold;
	color: black;
	margin: 20px 0px 20px 0px;
}

label {
	width: 95px;
	display: inline-block;
	text-align: right;
	font-size: 13px;
}
input {
	margin: 5px 5px;
	border-radius: 3px;
	background-color: transparent;
	border: 1px solid darkgray;
	height: 20px;
	outline: none;
}
#signup {
	text-align: center;
	margin: 5px;
}
input[type=button], input[type=reset] {
	border: 1px solid salmon;
	border-radius: 3px;
	background-color: transparent;
	margin: 0px;
	height: 24px;
	color: salmon;
}
input[type=button]:hover, input[type=reset]:hover {
	background-color: salmon;
	transition-duration: 1s;
	color: white;
	outline: none;
}

#roadAddress, #detailAddress {
	width: 280px;
}

.regex {
	font-size: 12px;
	text-align: center;
}

.msg{
	font-size: 12px;
	text-align: center;
}
</style>
 <body id="page-top">
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand" href="#page-top">COME ON BABY</a>
                <button class="navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="#about">COME ON BABY?</a></li>
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="pregnancyMain.jsp">임신</a></li>
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="parentingMain.jsp">육아</a></li>
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="#portfolio">지원기능</a></li>
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="#contact">문의</a></li>
                    	<li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown">Join</a>
                            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                                <li ><a class="dropdown-item" href="#login.jsp">로그인</a></li>
                                <li><a class="dropdown-item" href="write_view.cob">회원가입 </a></li>
                                <li><a class="dropdown-item" href="#">달력</a></li>
                                <li><hr class="dropdown-divider" /></li>
                                <li><a class="dropdown-item" href="#">관리자 로그인</a></li>
                            </ul>
                        </li>
                    </ul>
                    
					
                </div>
            </div>
        </nav>
        <br><br><br><br><br><br>
	<form action="write.cob" method="POST" id="signform">
		<div id="wrapper">
			<div class="title">회원 가입 정보 입력</div>
			<label>아이디 : </label><input type="text" name="id" id="id"> 
			<input type ="button" value="중복체크" id="chk">
			<div><span class="msg"id="msg" style="color: red"></span></div><br>
			<label>패스워드 : </label><input type="password" name="pw" id="pw"><br>
			<div class="pw regex"></div>
			<label>패스워드확인 : </label><input type="password" id="repw"><br>
			<div class="repw regex"></div>
			<label>이름: </label><input type="text" name="name" id="name"><br>
			<div class="name regex"></div>
			<label>전화번호 : </label><input type="text" name="phone" id="phone"><br>
			<div class="phone regex"></div>
			<label>이메일 : </label><input type="text" name="email" id="email"><br>
			<div class="email regex"></div>
			<label>생년월일 : </label><input type="date" name="date" id="date"><br>
			<label>우편번호 :</label><input type="text" id="postcode"
				placeholder="우편번호" name="zipcode"> <input type="button"
				onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
			<label>주소1 : </label><input type="text" id="roadAddress"
				placeholder="도로명주소" name="roadaddress"><br> <label>주소2
				: </label><input type="text" id="detailAddress" placeholder="상세주소"
				name="detailaddress"><br> <label>등록 병원 : </label><input
				type="text" name="userhospital" id="userhospital"><br>
			<div id="signup">
				<input type="button" name="signup" value="회원가입" id="signupbtn" >
				<input type="reset" value="다시입력" id="resignupbtn">
			</div>
		</div>
	</form>
	<script>
	$(function() {
		$('#chk').click(function() {
			var id = $('#id').val();
			var sendData = "id=" + id
			$.post('confirmId.jsp', sendData, function(msg) {
				$('#msg').html(msg);
			});
			});
	});
		//다음 우편번호 API
		//본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
		function sample4_execDaumPostcode() {
			new daum.Postcode({
				oncomplete : function(data) {
					// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
					// 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
					// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
					var roadAddr = data.roadAddress; // 도로명 주소 변수
					var extraRoadAddr = ''; // 참고 항목 변수
					// 법정동명이 있을 경우 추가한다. (법정리는 제외)
					// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
					if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
						extraRoadAddr += data.bname;
					}
					// 건물명이 있고, 공동주택일 경우 추가한다.
					if (data.buildingName !== '' && data.apartment === 'Y') {
						extraRoadAddr += (extraRoadAddr !== '' ? ', '
								+ data.buildingName : data.buildingName);
					}

					// 우편번호와 주소 정보를 해당 필드에 넣는다.
					document.getElementById('postcode').value = data.zonecode;
					document.getElementById("roadAddress").value = roadAddr;
				}
			}).open();
		}
		
		$(function() {
			// 중복확인 & id 유효성검사             
			$("#duplcheck")
					.on(
							"click",
							function() {
								var id = $("#id").val();
								if (id == "") {
									alert("아이디를 입력해주세요");
									return;
								}
								var regex = /^[a-z][a-z\d]{4,11}$/;
								var result = regex.exec(id);

								if (result != null) {
									$(".id.regex").html("");
									window
											.open("idDuplCheck.jsp?id=" + id,
													"",
													"width=500px,height=300px,top=300px,left=200px");
								} else {
									$(".id.regex").html("영어 소문자,숫자 4-12자리");
									$(".id.regex").css("color", "red")
								}
							})
			//비밀번호 유효성검사
			$("#pw").on("input", function() {
				var regex = /^[A-Za-z\d]{8,12}$/;
				var result = regex.exec($("#pw").val())
				if (result != null) {
					$(".pw.regex").html("");
				} else {
					$(".pw.regex").html("영어대소문자,숫자 8-11자리");
					$(".pw.regex").css("color", "red")
				}
			});
			//비밀번호 확인    
			$("#repw").on("keyup", function() {
				if ($("#pw").val() == $("#repw").val()) {
					$(".repw.regex").html("비밀번호가 일치합니다");
				} else {
					$(".repw.regex").html("비밀번호가 일치하지않습니다");
				}
			})

			//이름 유효성검사
			$("#name").on("input", function() {
				var regex = /[가-힣]{2,}/;
				var result = regex.exec($("#name").val());

				if (result != null) {
					$(".name.regex").html("");
				} else {
					$(".name.regex").html("한글만 입력 가능합니다.");
				}

			})

			//전화번호 유효성검사
			$("#phone").on("input", function() {
				var regex = /^01\d\d{3,4}\d{4}$/;
				var result = regex.exec($("#phone").val());

				if (result != null) {
					$(".phone.regex").html("");
				} else {
					$(".phone.regex").html("올바른 번호가 아닙니다");
				}

			})

			//email유효성 검사
			$("#email").on("input", function() {
				var regex = /.+@[a-z]+(\.[a-z]+){1,2}$/;
				var result = regex.exec($("#email").val());

				if (result != null) {
					$(".email.regex").html("");
				} else {
					$(".email.regex").html("올바른 이메일이 아닙니다");
				}
			})
			//회원가입 버튼 눌렀을 때, 빈칸 있으면 다시 유효성 검사진행    
			$("#signupbtn").on("click", function() {
				var id = $("#id").val();
				var pw = $("#pw").val();
				var name = $("#name").val();
				var phone = $("#phone").val();
				var email = $("#email").val();

				var idregex = /^[a-z][a-z\d]{4,11}$/;
				var pwregex = /^[A-Za-z\d]{8,12}$/;
				var nameregex = /[가-힣]{2,}/;
				var phoneregex = /^01\d\d{3,4}\d{4}$/;
				var emailregex = /.+@[a-z]+(\.[a-z]+){1,2}$/;

				var idregex = idregex.exec(id);
				if (idregex == null) {
					alert("아이디양식을 다시 확인해주세요");
					return;
				}
				var pwregex = pwregex.exec(pw);
				if (pwregex == null) {
					alert("비밀번호양식을 다시 확인해주세요");
					retrun;
				}
				var nameregex = nameregex.exec(name);
				if (nameregex == null) {
					alert("이름양식을 다시 확인해주세요");
					retrun;
				}
				var phoneregex = phoneregex.exec(phone);
				if (phoneregex == null) {
					alert("핸드폰번호양식을 다시 확인해주세요");
					retrun;
				}
				var emailregex = emailregex.exec(email);
				if (emailregex == null) {
					alert("이메일양식을 다시 확인해주세요");
					retrun;
				}
				//빈칸 없을 때 제출.
				$("#signform").submit();
			})
		})
	</script>
	  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <!-- * *                               SB Forms JS                               * *-->
        <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>
</html>