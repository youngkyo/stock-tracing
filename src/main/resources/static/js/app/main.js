var main = {
	init : function () {
		var _this = this;
		$('#recommend-stock-save').on('click', function () {
			_this.save();
		});

	},
	save : function () {
		var data = {
			weekDay: '',
			memberName: $('#memberName').val(),
			stockName: $('#stockName').val(),
			comment: $('#comment').val(),
			stockCode: ''
		};

		$.ajax({
			type: 'POST',
			url: '/stock/Register',
			dataType: 'json',
			contentType:'application/json; charset=utf-8',
			data: JSON.stringify(data),
			success: function() {
				alert('글이 등록되었습니다.');
				console.log('success');
				location.reload();
			},
			error: function () {
				alert('글이 등록되었습니다.');
				console.log('success');
				location.reload();
			}
		})
			// .done(function() {
			// alert('글이 등록되었습니다.');
			// console.log('success');
			// location.reload();
		// })
		//
		// .error(function (error) {
		// 	console.log('error');
		// 	alert(error);
		// 	location.reload();
		// });
	}
};

main.init();