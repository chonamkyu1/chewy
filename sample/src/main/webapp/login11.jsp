<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Sign in or register</h1>

	<div class="signin form-field-section">
		<h2>I'm a Returning customer</h2>
		<fieldset>
			<ol class="shelterFieldList">
				<li class="field field--error"><label for="username" class="">Email
						Address</label>
					<div class="field__wrapper" data-hj-suppress="">
						<input size="40" name="username" id="username" type="email"
							class="field__input field__input--email input--email" value=""
							aria-required="true" aria-describedby="username-error"
							aria-invalid="true">
					</div>
					<p id="username-error" class="field__message">Email address is
						required.</p></li>

				<li class="field"><label for="password" class="">Password</label>
					<div class="field__wrapper" data-hj-suppress="">
						<input size="25" name="password" id="password" type="password"
							class="field__input field__input--pw input--password">
					</div></li>
				<li><a id="forgotPassword" href="/app/resetpassword/start"
					class="js-forgot-password">Forgot your password?</a></li>

			</ol>
		</fieldset>
	</div>

	

</body>
</html>