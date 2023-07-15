var arr_hinh = [
    "../PS26461-PhamTheTinh-ASM/images/cover2.png",
    "../PS26461-PhamTheTinh-ASM/images/cover4.png",
    "../PS26461-PhamTheTinh-ASM/images/cover5.png",
    "../PS26461-PhamTheTinh-ASM/images/cover6.png",
];
var index = 0;
function prev() {
    index--;
    if (index < - 0) index = arr_hinh.length - 1;
    document.getElementById("hinh").src = arr_hinh[index];
}
function next() {
    index++;
    if (index == arr_hinh.length) index = 0;
    document.getElementById("hinh").src = arr_hinh[index];
}


var arr_hinh1 = [
    "../PS26461-PhamTheTinh-ASM/images/comment1 (1).png",
    "../PS26461-PhamTheTinh-ASM/images/comment1 (2).png",
    "../PS26461-PhamTheTinh-ASM/images/comment1 (3).png",
    "../PS26461-PhamTheTinh-ASM/images/comment1 (4).png",
    "../PS26461-PhamTheTinh-ASM/images/comment1 (5).png",
    "../PS26461-PhamTheTinh-ASM/images/comment1 (6).png",
];
var index1 = 0;
function prev1() {
    index1--;
    if (index1 < - 0) index1 = arr_hinh1.length - 1;
    document.getElementById("comment").src = arr_hinh1[index1];
}
function next1() {
    index1++;
    if (index1 == arr_hinh1.length) index1 = 0;
    document.getElementById("comment").src = arr_hinh1[index1];
}

function anicon(obj) {
    obj.querySelector("#icon").style.display = "none";
}
function hienicon(obj) {
    obj.querySelector("#icon").style.display = "block";
}






function fover() {
    var h = document.getElementById("hinh1");
    h.src = "../PS26461-PhamTheTinh-ASM/images/1,2.png";
}
function fout() {
    var h = document.getElementById("hinh1");
    h.src = "../PS26461-PhamTheTinh-ASM/images/1,1.png";
}

function fover1() {
    var h = document.getElementById("hinh2");
    h.src = "../PS26461-PhamTheTinh-ASM/images/2,2.png";
}
function fout1() {
    var h = document.getElementById("hinh2");
    h.src = "../PS26461-PhamTheTinh-ASM/images/2,1.png";
}

function fover2() {
    var h = document.getElementById("hinh3");
    h.src = "../PS26461-PhamTheTinh-ASM/images/3,2.png";
}
function fout2() {
    var h = document.getElementById("hinh3");
    h.src = "../PS26461-PhamTheTinh-ASM/images/3,1.png";
}

function fover3() {
    var h = document.getElementById("hinh4");
    h.src = "../PS26461-PhamTheTinh-ASM/images/4,2.png";
}
function fout3() {
    var h = document.getElementById("hinh4");
    h.src = "../PS26461-PhamTheTinh-ASM/images/4,1.png";
}

function fover4() {
    var h = document.getElementById("hinh5");
    h.src = "../PS26461-PhamTheTinh-ASM/images/5,2.png";
}
function fout4() {
    var h = document.getElementById("hinh5");
    h.src = "../PS26461-PhamTheTinh-ASM/images/5,1.png";
}

function fover5() {
    var h = document.getElementById("hinh6");
    h.src = "../PS26461-PhamTheTinh-ASM/images/6,2.png";
}
function fout5() {
    var h = document.getElementById("hinh6");
    h.src = "../PS26461-PhamTheTinh-ASM/images/6,1.png";
}

function fover6() {
    var h = document.getElementById("hinh7");
    h.src = "../PS26461-PhamTheTinh-ASM/images/7,2.png";
}
function fout6() {
    var h = document.getElementById("hinh7");
    h.src = "../PS26461-PhamTheTinh-ASM/images/7,1.png";
}

function fover7() {
    var h = document.getElementById("hinh8");
    h.src = "../PS26461-PhamTheTinh-ASM/images/8,2.png";
}
function fout7() {
    var h = document.getElementById("hinh8");
    h.src = "../PS26461-PhamTheTinh-ASM/images/8,1.png";
}

//mặc định giỏ hàng bị ẩn
document.getElementById("giohang").style.display = "none";
function showhide() {
    var x = document.getElementById("giohang");
    x.style.display = x.style.display == "block" ? "none" : "block";
}

function Delete(){
    var pa = x.parentNode;
    var hinh = null;
    var tensp = null;
    var gia = null;
}


var giohang = [];
function addcart(x) {
    var pa = x.parentNode;
    var hinh = pa.children[0].src;
    var tensp = pa.children[1].innerText;
    var gia = pa.children[2].innerText;
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
    document.getElementById("mycart").innerHTML = showcart();
}
function showcart() {
    var kq = "";
    var tongtien = 0;
    var tongsl = 0;
    for (var i = 0; i < giohang.length; i++) {
        kq += `<tr style="text-align:center">
              <td>${i + 1}</td>
              <td><img src="${giohang[i][0]}"/></td>
              <td>${giohang[i][1]}<br>
              <button onclick:"xoa()";>Delete</button></td>
              <td>${giohang[i][2]}</td>
              <td>${giohang[i][3]}</td>
              <td>${giohang[i][2] * giohang[i][3]}K</td>
          </tr>`
        //tong tien
        tongtien += giohang[i][2] * giohang[i][3];
        tongsl += giohang[i][3];
    }
    kq += `<tr style="height:50px">
                    <th colspan=5>Pay total</th>
                    <th>${tongtien}K VNĐ</th>
                </tr>`
    document.getElementById("countcart").innerText = tongsl;
    return kq;
}

document.getElementById("giohang").style.display = "none";
function showhide() {
    var x = document.getElementById("giohang");
    x.style.display = x.style.display == "block" ? "none" : "block";
}

function xoa(button){
    var row = button.parentElement.parentElement;
    document.getElementById("giohang").removeChild(row);
}
