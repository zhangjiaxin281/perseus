$(function () {
    $.getJSON("./data/data.json", "", function (data) {
        var navTree = $("nav");
        $.each(data.sites, function (i, item) {

            var li = "<li class='has-sub'><a><i class='fa fa-edit'></i> Forms <span class='fa fa-chevron-down'></span></a>" +
                "<ul class='nav child_menu'>" +
                "<li><a href='form.html'>General Form</a></li>"+
                "<li><a href='form_advanced.html'>Advanced Components</a></li>"+
                "<li><a href='form_validation.html'>Form Validation</a></li>"+
                "<li><a href='form_wizards.html'>Form Wizard</a></li>"+
                "<li><a href='form_upload.html'>Form Upload</a></li>"+
                "<li><a href='form_buttons.html'>Form Buttons</a></li>"+
                "</ul>" +
                "</li>";


            $("ul#nav-menu").append(li);
        });

        $(".has-sub>a").click(function () {
            $(this).parent().siblings().find(".child_menu").slideUp();//关闭展开的
            $(this).parent().find(".child_menu").slideToggle();//展开点开的
        })
    });


});
