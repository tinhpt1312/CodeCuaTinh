var giohang = [];


function addcart(x) {
    var pa = x.parentNode;
    var hinh = pa.children[0].src;
    var tensp = pa.children[1].innerText;
    var gia = Number(pa.children[2].innerText.substring(1));
    var sl = 1;
    var flag = 0;
    //ktra xem co tensp do trong gio hang chua
    for (var i = 0; i < giohang.length; i++) {
        if (tensp == giohang[i][1]) {
            giohang[i][3] += 1;
            flag = 1;
        }
    }
    //khi chua co sp trong gio hang
    if (flag == 0) {
        item = [hinh, tensp, gia, sl];
        giohang.push(item);
    }
    //xuat ra table gio hang
    document.getElementById("my-cart").innerHTML = showcart();
}
function showcart() {
    var kq = "";
    var tongtien = 0;
    var tongsl = 0;
    for (var i = 0; i < giohang.length; i++) {
        kq += `<tr style="text-align:center">
              <td>${i + 1}</td>
              <td><img src="${giohang[i][0]}"/></td>
              <td>${giohang[i][1]}</td>
              <td>$${giohang[i][2]}</td>
              <td>${giohang[i][3]}</td>
              <td>$${giohang[i][2] * giohang[i][3]}</td>
          </tr>`
        //tong tien
        tongtien += giohang[i][2] * giohang[i][3];
        tongsl += giohang[i][3];
    }
    kq += `<tr>
                    <th colspan=5>Pay total</th>
                    <th>$${tongtien}</th>
                </tr>`
    document.getElementById("countcart").innerText = tongsl;
    return kq;
}

function kiemtra() {
    checkname();
    checkphone();
    checkmail();
    checkdiachi();
}

function checkname() {
    thanhcong = true;
    thongbao = "";
    //code kiểm tra tên sp
    var name = document.getElementById("hoten");
    if (name.value.length == 0) {
        thongbao += "Vui lòng nhập tên sản phẩm";
        thanhcong = false;
    }

    // if (thongbao == "") thongbao = "Nhập đúng dữ liệu";
    document.getElementById("name").innerHTML = thongbao;
    return thanhcong;
}
function checkphone() {
    thanhcong = true;
    thongbao = "";
    //code kiểm tra tên sp
    var gia = document.getElementById("dienthoai");
    if (gia.value == "") {
        thongbao += "Vui lòng nhập số điện thoại";
        thanhcong = false;
    }

    // if (thongbao == "") thongbao = "Nhập đúng dữ liệu";
    document.getElementById("phone").innerHTML = thongbao;
    return thanhcong;
}

function checkmail() {
    thanhcong = true;
    thongbao = "";
    //code kiểm tra tên sp
    var email = document.getElementById("mail");
    if (email.value.length == 0) {
        thongbao += "Vui lòng nhập Email";
        thanhcong = false;
    }

    // if (thongbao == "") thongbao = "Nhập đúng dữ liệu";
    document.getElementById("email").innerHTML = thongbao;
    return thanhcong;
}

function checkdiachi(){
    thanhcong = true;
    thongbao = "";
    var diachi = document.getElementById("diachi1");
    if (diachi.value.length == 0) {
        thongbao += "Vui lòng nhập địa chỉ giao hàng";
        thanhcong = false;
    }

    // if (thongbao == "") thongbao = "Nhập đúng dữ liệu";
    document.getElementById("diachi").innerHTML = thongbao;
    return thanhcong;
}