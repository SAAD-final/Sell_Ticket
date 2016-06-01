/*need to change*/
$(document).ready(function () {
    $("#login_and_register_button").click(function() {
        $.ajax({
            type: "POST",
            url: "/login_or_register",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(GetJsonData()),
            dataType: "json",
            success: function (message) {
                if (message > 0) {
                    alert("注册成功！");
                }
            },
            error: function (message) {
                alert("注册失败，请重试！");
            }
        });
    });
    function GetJsonData() {
        var json = {
            "a": 1,
            "b": 2
            /*"classid": 2,
            "name": $("#tb_name").val(),
            "zlclass": "测试类型1,测试类型2,测试类型3",
            "pname": $("#tb_contact_people").val(),
            "tel": $("#tb_contact_phone").val()*/
        };
        return json;
    }
});
