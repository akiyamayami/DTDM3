<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<td>
	<script src='ckeditor/ckeditor.js'></script>
			<div id="editor1" contenteditable="true">
			</div>
			<script>
			    // Turn off automatic editor creation first.
			    //CKEDITOR.disableAutoInline = true;
			    CKEDITOR.replace( 'editor1' );
			    const editor1 = CKEDITOR.instances.editor1;
			    editor1.setData('<H1>${message}</H1>')
			</script>
		</td>
	<td>
		<div id="pnRight">
			<jsp:include page="pnRight.jsp" />
		</div>
	</td>
</body>
</html>