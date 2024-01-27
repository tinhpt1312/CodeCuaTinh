var app = angular
  .module("myapp", ["ngRoute"])
  .config(function ($routeProvider) {
    $routeProvider
      .when("/home", {
        templateUrl: "home.html",
        controller: "homeCtrl",
        controllerAs: "home",
      })
      .when("/cart", {
        templateUrl: "cart.html",
        controller: "cartCtrl",
      })
      .when("/login", {
        templateUrl: "login.html",
        controller: "homeCtrl",
      })
      .when("/signUp", {
        templateUrl: "signup.html",
        controller: "homeCtrl",
      })
      .when("/chitietSP/:id", {
        templateUrl: "chiTietSP.html",
        controller: "chitietSPCtrl",
      })
      .otherwise({
        redirectTo: "/home",
      });
  })
  .controller("myctrl", function myfunc($scope, $rootScope, $http) {
    $scope.listSP = [
      // {
      //     id: 1,
      //     name: 'Ổ cứng di động SSD 256GB Transcend ESD310 1050MB/s',
      //     brand: 'Transcend',
      //     loai: 'Ổ cứng SSD di động gắn ngoài',
      //     dungLuong: '256gb',
      //     kichThuoc: '71.3 x 20 x 7.8mm',
      //     tocDoDoc: '1050MB/s',
      //     tocDoGhi: '950MB/s',
      //     baoHanh: '5 năm',
      //     model: 'TS256GESD310C',
      //     chuanGiaoTiep: 'USB 3.2 Gen2x1 ; USB Type-A/ USB Type-C (Tương thích ngược USB 2.0; 1.0)',
      //     heDieuHanh: 'Windows 7 trở lên, MacOS 10.10 trở lên',
      //     mau: 'Đen',
      //     detail_header1: 'Chuyển dữ liệu siêu nhanh - thiết kế gọn nhẹ',
      //     detail1: 'Ổ cứng SSD di động Transcend ESD310</span> mang đến khả năng truyền dữ liệu với tốc độ đáng kinh ngạc kết hợp cùng thiết kế kích thước siêu nhỏ - tựa một chiếc USB. ESD310 xứng đáng là một ổ cứng SSD lưu trữ bên ngoài tiện lợi và hiệu quả nhất mà bạn không nên bỏ lỡ!',
      //     detail_header2: 'Tốc độ siêu cao',
      //     detail2: 'Ổ cứng SSD di động Transcend ESD310 cho tốc độ truyền 10Gbps và công nghệ Cache SLC giúp tốc độ read và write lên đến 1050/ 950 MB/s.',
      //     detail_header3: 'Dễ dàng kết nối',
      //     detail3: 'Ổ cứng SSD di động Transcend ESD310 thiết kế hai đầu nối USB Type-A và Type-C trong một giúp việc kết nối các thiết bị trở nên dễ dàng hơn. Bạn chỉ cần cắm nó vào thiết bị của bạn, không cần cáp và bạn có thể tận hưởng tốc độ truyền tệp nhanh mà không bị chậm trễ!',
      //     detail_header4: 'Tương thích cực tốt',
      //     detail4: 'Ổ cứng SSD di động Transcend ESD310 tương thích hoàn toàn với máy tính cũng như với các thiết bị di động và máy chơi game di động, cung cấp tốc độ truyền cực nhanh và mở rộng dung lượng lớn hơn cho hầu hết mọi nhu cầu của bạn.',
      //     detail_header5: 'Tản nhiệt nhanh',
      //     detail5: 'Ổ cứng SSD di động Transcend ESD310 được đặt trong một vỏ khung bằng hợp kim nhôm giúp tản nhiệt và bảo vệ tốt hơn. Bên cạnh đó, chức năng ECC tích hợp mang lại sự ổn định vượt trội cho việc lưu trữ dữ liệu.',
      //     detail_header6: 'Quản lý dữ liệu với Transcend Elite',
      //     detail6: 'Transcend Elite là gói phần mềm quản lý dữ liệu tiên tiến tương thích với macOS, Windows OS và Android. Có sẵn dưới dạng cả ứng dụng dành cho máy tính để bàn và thiết bị di động, đây là bản tải xuống miễn phí từ trang web chính thức của Transcend và từ Google Play. Transcend Elite có tính năng sao lưu và khôi phục, mã hóa dữ liệu, sao lưu đám mây và chức năng khóa mật khẩu.',
      //     price: 1250000,
      //     price_discount: 950000,
      //     image: [
      //         'ssd256_Transcend256gb(2)',
      //         'ssd256_Transcend256gb(1)',
      //         'ssd256_Transcend256gb(3)',
      //         'ssd256_tiny-but-mighty',
      //         'ssd256_transfer_fast',
      //         'ssd256_highspeed',
      //         'ssd256_easy_connect',
      //         'ssd256_well_compatibled',
      //         'ssd256_cooling',
      //         'ssd256_transcend-elite',
      //     ]
      // },
      // {
      //     id: 2,
      //     name: 'Ổ cứng di động SSD 500GB Transcend ESD270C 520MB/s',
      //     brand: 'Transcend',
      //     loai: 'Ổ cứng SSD di động gắn ngoài',
      //     dungLuong: '500gb',
      //     kichThuoc: '77 x 55.7 x 9.6mm',
      //     tocDoDoc: '520MB/s',
      //     tocDoGhi: '460MB/s',
      //     baoHanh: '3 năm 1 đổi 1',
      //     model: 'TS500GESD270C',
      //     chuanGiaoTiep: 'USB 3.1 Gen2 ; USB Type-C (Tương thích ngược USB 2.0; 1.0)',
      //     heDieuHanh: 'Windows, MacOS, Linux,...',
      //     mau: 'Đen',
      //     detail_header1: 'Kích thước nhỏ gọn',
      //     detail1: 'Ổ cứng di động SSD Transcend ESD270C là một ổ đĩa SSD di động nhỏ gọn với thiết kế màu đen huyền bí, được trang bị chuẩn giao tiếp USB 3.1 Gen 2 cho tốc độ truyền tải chưa từng có với giao tiếp USB Type-C.',
      //     detail_header2: 'Tốc độ siêu cao',
      //     detail2: 'Ổ cứng di động SSD Transcend ESD270C được trang bị chuẩn USB 3.1 Gen 2 và hỗ trợ UASP (USB Attached SCSI Protocol), cung cấp tốc độ truyền nhanh chóng lên tới 520 MB/s.',
      //     detail_header3: 'Mở rộng không gian lưu trữ của bạn',
      //     detail3: 'Ổ cứng di động SSD Transcend ESD270C có dung lượng lên tới 1TB, đảm bảo bạn có nhiều không gian để sao lưu và lưu trữ hình ảnh độ phân giải cao, video 4K và các tệp phương tiện khác!',
      //     detail_header4: 'Cáp đi kèm',
      //     detail4: 'Ổ cứng di động SSD Transcend ESD270C đi kèm với cả cáp USB Type-C sang USB Type-C và cáp USB Type-C sang Type-A để bạn có thể sử dụng với tất cả các thiết bị trên thị trường hiện nay.',
      //     detail_header5: 'Mã hóa AES 256-bit mạnh mẽ',
      //     detail5: 'Ổ cứng di động SSD Transcend ESD270C của Transcend hỗ trợ mã hóa AES 256-bit để bảo vệ dữ liệu một cách an toàn và đáng tin cậy. AES (Advanced Encryption Standard) là một thuật toán mật mã được xác định bởi Viện Tiêu chuẩn và Công nghệ Quốc gia (NIST). Quá trình mã hóa và giải mã được xử lý nghiêm ngặt trong bộ điều khiển SSD và hoàn toàn độc lập với bất kỳ hệ điều hành hoặc chương trình nào, khiến AES dựa trên phần cứng không thể giải mã được.',
      //     detail_header6: 'Quản lý dữ liệu với Transcend Elite',
      //     detail6: 'Transcend Elite là gói phần mềm quản lý dữ liệu tiên tiến tương thích với macOS, Windows OS và Android. Có sẵn dưới dạng cả ứng dụng dành cho máy tính để bàn và thiết bị di động, đây là bản tải xuống miễn phí từ trang web chính thức của Transcend và từ Google Play. Transcend Elite có tính năng sao lưu và khôi phục, mã hóa dữ liệu, sao lưu đám mây và chức năng khóa mật khẩu.',
      //     price: 1350000,
      //     price_discount: 1090000,
      //     image: [
      //         'ssd500gb_ssd_pocket',
      //         'ssd500gb_Transcend',
      //         'ssd500gb_ssd1',
      //         'ssd500gb_header_SSD_detail',
      //         'ssd500gb_small_size',
      //         'ssd500gb_high_speed',
      //         'ssd500gb_ssd_3D',
      //         'ssd500gb_ssd_cables',
      //         'ssd500gb_AES256bit_decrypted',
      //         'ssd500gb_transcend_elite',
      //     ]
      // },
      // {
      //     id: 3,
      //     name: 'Ổ cứng di động SSD 512GB Transcend ESD310 1050MB/s',
      //     brand: 'Transcend',
      //     loai: 'Ổ cứng SSD di động',
      //     dungLuong: '512gb',
      //     kichThuoc: '71.3 x 20 x 7.8mm',
      //     tocDoDoc: '1050MB/s',
      //     tocDoGhi: '950MB/s',
      //     baoHanh: '60 tháng',
      //     model: 'TS512GESD310',
      //     chuanGiaoTiep: 'USB 3.2 Gen2x1 ; USB Type-A/ USB Type-C (Tương thích ngược USB 2.0; 1.0)',
      //     heDieuHanh: 'Windows 7 trở lên, MacOS 10.10 trở lên',
      //     mau: 'Đen/ Bạc/Hồng',
      //     detail_header1: 'Chuyển dữ liệu siêu nhanh - thiết kế gọn nhẹ',
      //     detail1: 'Ổ cứng SSD di động Transcend ESD310 mang đến khả năng truyền dữ liệu với tốc độ đáng kinh ngạc kết hợp cùng thiết kế kích thước siêu nhỏ - tựa một chiếc USB. ESD310 xứng đáng là một ổ cứng SSD lưu trữ bên ngoài tiện lợi và hiệu quả nhất mà bạn không nên bỏ lỡ!',
      //     detail_header2: 'Tốc độ siêu cao',
      //     detail2: 'Ổ cứng SSD di động Transcend ESD310 cho tốc độ truyền 10Gbps và công nghệ Cache SLC giúp tốc độ read và write lên đến 1050/ 950 MB/s.',
      //     detail_header3: 'Dễ dàng kết nối',
      //     detail3: 'Ổ cứng SSD di động Transcend ESD310 thiết kế hai đầu nối USB Type-A và Type-C trong một giúp việc kết nối các thiết bị trở nên dễ dàng hơn. Bạn chỉ cần cắm nó vào thiết bị của bạn, không cần cáp và bạn có thể tận hưởng tốc độ truyền tệp nhanh mà không bị chậm trễ!',
      //     detail_header4: 'Tương thích cực tốt',
      //     detail4: 'Ổ cứng SSD di động Transcend ESD310 tương thích hoàn toàn với máy tính cũng như với các thiết bị di động và máy chơi game di động, cung cấp tốc độ truyền cực nhanh và mở rộng dung lượng lớn hơn cho hầu hết mọi nhu cầu của bạn.',
      //     detail_header5: 'Tản nhiệt nhanh',
      //     detail5: 'Ổ cứng SSD di động Transcend ESD310 được đặt trong một vỏ khung bằng hợp kim nhôm giúp tản nhiệt và bảo vệ tốt hơn. Bên cạnh đó, chức năng ECC tích hợp mang lại sự ổn định vượt trội cho việc lưu trữ dữ liệu.',
      //     detail_header6: 'Quản lý dữ liệu với Transcend Elite',
      //     detail6: 'Transcend Elite là gói phần mềm quản lý dữ liệu tiên tiến tương thích với macOS, Windows OS và Android. Có sẵn dưới dạng cả ứng dụng dành cho máy tính để bàn và thiết bị di động, đây là bản tải xuống miễn phí từ trang web chính thức của Transcend và từ Google Play. Transcend Elite có tính năng sao lưu và khôi phục, mã hóa dữ liệu, sao lưu đám mây và chức năng khóa mật khẩu.',
      //     price: 1490000,
      //     price_discount: 1250000,
      //     image: [
      //         'ssd512_full_color',
      //         'ssd512_fullbox',
      //         'ssd512_pink',
      //         'ssd512_header_detail',
      //         'ssd512_fast_transfer',
      //         'ssd512_highspeed',
      //         'ssd512_easy_connect',
      //         'ssd512_well_compatibled',
      //         'ssd512_cooling',
      //         'ssd512_transcend_elite',
      //     ]
      // },
      // {
      //     id: 4,
      //     name: 'Ổ cứng di động SSD 1TB Transcend ESD270C 520MB/s',
      //     brand: 'Transcend',
      //     loai: 'Ổ cứng di động gắn ngoài',
      //     dungLuong: '1TB',
      //     kichThuoc: '77 x 55.7 x 9.6mm',
      //     tocDoDoc: '520MB/s',
      //     tocDoGhi: '460MB/s',
      //     baoHanh: '36 tháng',
      //     model: 'TS1TESD270C',
      //     chuanGiaoTiep: 'USB 3.1 Gen2 ; USB Type-C (Tương thích ngược USB 2.0; 1.0)',
      //     heDieuHanh: 'Windows, MacOS, Linux,..',
      //     mau: 'Đen',
      //     detail_header1: 'Kích thước nhỏ gọn',
      //     detail1: 'Ổ cứng di động SSD Transcend ESD270C là một ổ đĩa SSD di động nhỏ gọn với thiết kế màu đen huyền bí, được trang bị chuẩn giao tiếp USB 3.1 Gen 2 cho tốc độ truyền tải chưa từng có với giao tiếp USB Type-C.',
      //     detail_header2: 'Tốc độ siêu cao',
      //     detail2: 'Ổ cứng di động SSD Transcend ESD270C được trang bị chuẩn USB 3.1 Gen 2 và hỗ trợ UASP (USB Attached SCSI Protocol), cung cấp tốc độ truyền nhanh chóng lên tới 520 MB/s.',
      //     detail_header3: 'Thiết kế tinh tế',
      //     detail3: 'Ổ cứng di động SSD Transcend ESD270C được trang bị vỏ nhôm siêu nhẹ và giúp chống sốc tối ưu, làm tăng tính di động và tính bền bỉ.',
      //     detail_header4: 'Tương thích cực tốt',
      //     detail4: 'Ổ cứng di động SSD Transcend ESD270C tương thích hoàn toàn với máy tính cũng như với các thiết bị di động và máy chơi game di động, cung cấp tốc độ truyền cực nhanh và mở rộng dung lượng lớn hơn cho hầu hết mọi nhu cầu của bạn.',
      //     detail_header5: 'Mã hóa AES 256-bit mạnh mẽ',
      //     detail5: 'Ổ cứng di động SSD Transcend ESD270C của Transcend hỗ trợ mã hóa AES 256-bit để bảo vệ dữ liệu một cách an toàn và đáng tin cậy. AES (Advanced Encryption Standard) là một thuật toán mật mã được xác định bởi Viện Tiêu chuẩn và Công nghệ Quốc gia (NIST). Quá trình mã hóa và giải mã được xử lý nghiêm ngặt trong bộ điều khiển SSD và hoàn toàn độc lập với bất kỳ hệ điều hành hoặc chương trình nào, khiến AES dựa trên phần cứng không thể giải mã được.',
      //     detail_header6: 'Quản lý dữ liệu với Transcend Elite',
      //     detail6: 'Transcend Elite là gói phần mềm quản lý dữ liệu tiên tiến tương thích với macOS, Windows OS và Android. Có sẵn dưới dạng cả ứng dụng dành cho máy tính để bàn và thiết bị di động, đây là bản tải xuống miễn phí từ trang web chính thức của Transcend và từ Google Play. Transcend Elite có tính năng sao lưu và khôi phục, mã hóa dữ liệu, sao lưu đám mây và chức năng khóa mật khẩu.',
      //     price: 1890000,
      //     price_discount: 1590000,
      //     image: [
      //         'ssd1tb_ssd2',
      //         'ssd1tb_pocket',
      //         'ssd1tb_ssd1',
      //         'ssd1tb_header_detail',
      //         'ssd1tb_smallsize',
      //         'ssd1tb_highspeed',
      //         'ssd1tb_design',
      //         'ssd1tb_well_compatible',
      //         'ssd1tb_AES256bit',
      //         'ssd1tb_transcend_elite',
      //     ]
      // },
      // {
      //     id: 5,
      //     name: 'SSD Transcend 250GB M.2 2242 SATA III MTS425S 3D-NAND',
      //     brand: 'Transcend',
      //     loai: 'M.2 2242 SATA III',
      //     dungLuong: '250gb',
      //     kichThuoc: '22mm x 42mm',
      //     tocDoDoc: '500MB/s',
      //     tocDoGhi: '330MB/s',
      //     baoHanh: 'Bảo hành chính hãng 3 năm 1 đổi 1.',
      //     model: 'TS250GMTS425S',
      //     chuanGiaoTiep: 'M.2 2242 SATA III',
      //     heDieuHanh: 'Windows 7 trở lên, MacOS 10.10 trở lên',
      //     mau: 'Đen',
      //     detail_header1: 'Siêu nhanh - Siêu nhỏ gọn',
      //     detail1: 'Bạn đang tìm một sản phẩm giúp nâng hiệu năng tổng thể và khả năng lưu trữ của máy tính? Ổ cứng SSD Transcend M.2 2242 SATA III MTS425S 3D-NAND sẽ giúp bạn. Sản phẩm có kích thước nhỏ gọn và chuẩn giao tiếp SATA III 6GB/s, phù hợp với tất cả các dòng máy tính Laptop hỗ trợ cổng M.2 SATA III 2242, giúp giảm thiểu tối đa thời gian đáp ứng của hệ thống, kích thước nhỏ gọn. Giúp bạn làm việc nhanh hơn và tiết kiệm thời gian hơn.',
      //     detail_header2: 'Tốc độ cực cao với công nghệ 3D-NAND',
      //     detail2: 'Với công nghệ chíp nhớ tiên tiến nhất hiện nay là 3D-NAND Flash và bộ Cache SLC được trang bị bên trong, ổ cứng SSD Transcend M.2 2242 SATA III MTS425S 3D-NAND tốc độ đọc lên đến 500MB/s sẽ đáp ứng mọi nhu cầu về tốc độ của các Game thủ. Giảm thiểu tối đa độ trễ, tăng hiệu suất máy tính cũng như giúp bạn trải nghiệm tốt nhất khi chơi Games.',
      //     detail_header3: 'Kích thước nhỏ gọn',
      //     detail3: 'Ổ cứng SSD Transcend M.2 2242 SATA III MTS425S 3D-NAND với kích thước M.2 2242 cùng với chuẩn tốc độ của chuẩn SATA III 6Gbps sẽ mang đến một hiệu suất cùng độ tin cậy tuyệt với trong hình hài bé nhỏ.',
      //     detail_header4: 'Hỗ trợ DevSleep và ISRT',
      //     detail4: 'Ổ cứng SSD Transcend M.2 2242 SATA III MTS425S 3D-NAND hỗ trợ chế độ Sleep Mode của SATA (DevSleep) và Intel Smart Response Technology (ISRT). DevSleep cho phép máy tính tắt hoàn toàn các thiết bị cổng SATA khi không sử dụng và có thời gian đáp ứng khi kích hoạt là 20ms để tiết kiệm năng lượng. Với ISRT, người dùng có thể cấu hình hệ thống máy tính của họ bằng việc SSD được sử dụng làm bộ nhớ cache giữa ổ đĩa cứng và bộ nhớ hệ thống. Giúp đặt dung lượng lưu trữ tối đa trong khi vẫn cung cấp hiệu suất tổng thể cho hệ thống SSD.',
      //     detail_header5: 'Tản nhiệt nhanh',
      //     detail5: 'Ổ cứng SSD Transcend M.2 2242 SATA III MTS425S 3D-NAND được đặt trong một vỏ khung bằng hợp kim nhôm giúp tản nhiệt và bảo vệ tốt hơn. Bên cạnh đó, chức năng ECC tích hợp mang lại sự ổn định vượt trội cho việc lưu trữ dữ liệu.',
      //     detail_header6: 'Quản lý dữ liệu với Transcend Elite',
      //     detail6: 'Transcend Elite là gói phần mềm quản lý dữ liệu tiên tiến tương thích với macOS, Windows OS và Android. Có sẵn dưới dạng cả ứng dụng dành cho máy tính để bàn và thiết bị di động, đây là bản tải xuống miễn phí từ trang web chính thức của Transcend và từ Google Play. Transcend Elite có tính năng sao lưu và khôi phục, mã hóa dữ liệu, sao lưu đám mây và chức năng khóa mật khẩu.',
      //     price: 1250000,
      //     price_discount: 950000,
      //     image: [
      //         'ssd250gb_fullbox',
      //         'ssd250gb_ssd1',
      //         'ssd250gb_ssd2',
      //         'ssd250gb_header_detail',
      //         'ssd250gb_superFast',
      //         'ssd250gb_3Dnand',
      //         'ssd250gb_smallSize',
      //         'ssd250gb_devSleep',
      //         'ssd250gb_superFast',
      //         'ssd256_transcend-elite',
      //     ]
      // },
      // {
      //     id: 6,
      //     name: 'Ổ cứng di động Transcend StoreJet Slim 25M3S 4TB',
      //     brand: 'Transcend',
      //     loai: 'Ổ cứng SSD di động gắn ngoài',
      //     dungLuong: '4tb',
      //     kichThuoc: '129.5 x 80.8 x 16.1 mm',
      //     tocDoDoc: 'Lến đến 5Gb/s',
      //     tocDoGhi: 'Lến đến 5Gb/s',
      //     baoHanh: '36 tháng (áp dụng cho sp mua từ T6/2022 về sau)',
      //     model: 'StoreJet 25M3S TS4TSJ25M3S',
      //     chuanGiaoTiep: 'USB 3.0',
      //     heDieuHanh: 'Windows, MacOS, Linux,...',
      //     mau: 'Xám viền xanh',
      //     detail_header1: 'Tốc độ siêu cao',
      //     detail1: 'Ổ cứng di động USB 3.0 StoreJet 25M3S được trang bị cổng SuperSpeed USB thế hệ 3.0 mang đến tốc độ truyền gấp 3 lần so với USB 2.0. Nhờ có băng thông được cải tiến của USB 3.0, StoreJet 25M3S giúp bạn chia sẻ dữ liệu dễ dàng hơn và nhanh hơn bao giờ hết với tốc độ truyền thực tế lên đến 100MB/s.',
      //     detail_header2: 'Chống Sock đạt tiêu chuẩn quân đội',
      //     detail2: 'Nhỏ gọn, bền và đáng tin cậy, ổ cứng di động USB 3.0 StoreJet 25M3S bên ngoài trông khá gồ ghề vì được bảo vệ bởi một hệ thống bảo vệ sốc ba lớp tiên tiến chống lại được các môi trường sử dụng khắc nghiệt nhất. Vỏ ngoài được làm bằng chất liệu Silicone chống tác động mạnh, bên trong được gia cố bởi một vỏ cứng và một hệ thống cố định ổ cứng bên trong - tất cả được thiết kế để giảm lực tác động và giảm Sock tối đa.',
      //     detail_header3: 'Auto - Backup',
      //     detail3: 'Ổ cứng di động USB 3.0 StoreJet 25M3S được trang bị một nút tự động sao lưu One-Touch cực kỳ thuận tiện cho việc sao lưu dữ liệu và đồng bộ hóa ngay lập tức khi được sử dụng với phần mềm Transcend Elite. Ngoài ra, ổ cứng di động USB 3.0 StoreJet 25M3S hỗ trợ tất cả các hệ điều hành Microsoft Windows 8/7 / Vista / XP, Mac OS X, và các hệ thống Linux, và tương thích ngược với các cổng USB 2.0.',
      //     detail_header4: 'Phần mềm quản lý dữ liệu Transcend Elite',
      //     detail4: 'Ổ cứng di động USB 3.0 StoreJet 25M3S đi kèm với phầm mềm Transcend Elite, một công cụ quản lý dữ liệu độc quyền giúp bạn quản lý dữ liệu và tăng năng suất, hiệu năng của ổ đĩa. Với phần mềm này, bạn có thể dễ dàng thực hiện sao lưu, nén tập tin với mã hóa 256-bit AES Encryption, và sử dụng ổ đĩa cứng như là một chìa khóa kỹ thuật số BitLocker cho máy tính của bạn.',
      //     detail_header5: 'RecoveRX - Phầm mềm cứu dữ liệu đi kèm',
      //     detail5: 'Ngoài phần mềm quả lý ổ đĩa thì ổ cứng di động USB 3.0 StoreJet 25M3S được trang bị thêm phần mềm cứu dữ liệu miễn phí sẽ giúp bạn dễ dàng phục hồi những dữ liệu bị xóa nhầm.',
      //     price: 3600000,
      //     price_discount: 2990000,
      //     image: [
      //         'ssd4tb_ssd1',
      //         'ssd4tb_ssd2',
      //         'ssd4tb_fullbox',
      //         'ssd4tb_header_detail',
      //         'ssd4tb_ssd1',
      //         'ssd4tb_military',
      //         'ssd4tb_autobackup',
      //         'ssd4tb_transcendElite',
      //         'ssd4tb_recoveRX'
      //     ]
      // },
      // {
      //     id: 7,
      //     name: 'Đầu đọc thẻ nhớ Transcend USB Type-C OTG',
      //     brand: 'Transcend',
      //     loai: 'Đầu đọc thẻ nhớ OTG',
      //     dungLuong: '...',
      //     kichThuoc: '...',
      //     tocDoDoc: '...',
      //     tocDoGhi: '...',
      //     baoHanh: '12 tháng',
      //     model: 'TS-RDC3',
      //     chuanGiaoTiep: 'USB Type-C (Male), MicroSDHC, MicroSDXC, SDHC, SDXC',
      //     heDieuHanh: 'Windows. Linux. MacOS, IOS, Androi,...',
      //     mau: 'Đen',
      //     detail_header1: 'Đầu đọc thẻ nhớ Transcend USB Type-C OTG TS-RDC3',
      //     detail1: 'Đầu đọc thẻ nhớ Transcend USB Type-C OTG TS-RDC3 là một đầu đọc thông minh OTG (On-The-Go) được thiết kế đặc biệt cho điện thoại thông minh, máy tính bảng Android, Laptop, Macbook đi kèm với cổng USB Type-C thế hệ mới. Ngoài khe cắm thẻ SD và khe cắm thẻ microSD, Phần mềm Transcend Elite miễn phí đi kèm giúp bạn dễ dàng quản lý các dữ liệu kỹ thuật số trên điện thoại thông minh hoặc máy tính bảng Android của bạn.',
      //     detail_header2: 'Chuẩn giao tiếp USB Type-C đảo chiều',
      //     detail2: 'Đầu đọc thẻ nhớ Transcend USB Type-C OTG TS-RDC3 của Transcend đi kèm với đầu nối USB Type-C có thể đảo ngược giúp dễ dàng sử dụng hơn. Ngoài điện thoại thông minh và máy tính bảng Android có cổng USB Type-C, đầu đọc thẻ nhớ Transcend USB Type-C OTG TS-RDC3 cũng có thể được sử dụng trên các máy tính xách tay Laptop mới với cổng Type-C, chẳng hạn như MacBook 12 inch của Apple và Chromebook Pixel 2 của Google.',
      //     detail_header3: 'Hỗ trợ hai khe cắm thẻ nhớ',
      //     detail3: 'Đầu đọc thẻ nhớ Transcend USB Type-C OTG TS-RDC3 được trang bị cả khe cắm thẻ SD và khe cắm thẻ microSD. Khe cắm thẻ SD hỗ trợ thẻ nhớ UHS-I SDXC và SDHC, khe cắm thẻ microSD giúp mở rộng dung lượng lưu trữ thiết bị di động của bạn.',
      //     detail_header4: 'Ứng dụng Elite Transcend Elite độc quyền',
      //     detail4: 'Với chức năng Quản lý tập tin, mã hóa và One-Touch Backup, ứng dụng Transcend Elite cho phép bạn dễ dàng truy cập các tập tin dữ liệu trên thẻ nhớ hoặc ổ flash USB. Chuyển các tệp với Mã hóa AES 256 bit, chia sẻ với nhiều dịch vụ lưu trữ đám mây và sao lưu nhanh ảnh, video, tài liệu và nội dung quan trọng khác được lưu trữ trên thiết bị Android của bạn.',
      //     detail_header5: 'Thiết kế cực kỳ nhỏ gọn',
      //     detail5: 'Đầu đọc thẻ nhớ Transcend USB Type-C OTG TS-RDC3 cực kỳ nhỏ gọn và dễ dàng nằm gọn trong túi của bạn, làm cho nó trở thành bạn đồng hành tuyệt vời.',
      //     detail_header6: 'RecoveRx software',
      //     detail6: 'Đi kèm với phần mềm phục hồi dữ liệu, bạn có thể yên tâm khi các dữ liệu quan trọng có thể được phục hồi.',
      //     price: 360000,
      //     price_discount: 435000,
      //     image: [
      //         'cardReader_pic1',
      //         'cardReader_pic2',
      //         'cardReader_fullbox',
      //         'cardReader_header_detail',
      //         'cardReader_usbTypeC',
      //         'cardReader_usbTypeC_reverse',
      //         'cardReader_twohole',
      //         'cardReader_elite',
      //         'cardReader_smallSize',
      //         'cardReader_RX',
      //     ]
      // }
    ];
    $scope.cart = [];
    $http.get("data.json").then(function (res) {
      $scope.listSP = res.data;
      console.log(res);
    });
    $scope.muaHang = function (sp) {
      var cartEmpty = true;
      for (const item of $scope.cart) {
        if (item.id == sp.id) {
          item.soluong++;
          cartEmpty = false;
          break;
        }
      }
      if (cartEmpty) {
        sp.soluong = 1;
        $scope.cart.push(sp);
      }
    };
  })

  .controller("addcart", function ($scope, $rootScope) {
    $scope.mua = function (sp) {
      var chuaCo = true;
      //TH1: chưa có sp trong giỏ hàng
      for (const item of $rootScope.cart) {
        //TH2: Có sản phẩm tăng lên
        if (item.id == sp.id) {
          item.soluong++;
          chuaCo = false;
          break;
        }
      }
      if (chuaCo) {
        sp.soluong = 1;
        $rootScope.cart.push(sp);
      }
    };
  })

  .controller("homeCtrl", function myfunc($scope, $rootScope, $http) {
    $scope.kieu = "";
    $scope.cot = "";
    $scope.sapXep = function (cot, kieu) {
      $scope.cot = cot;
      $scope.kieu = kieu;
    };
    $scope.limit = 4;
    $scope.showMore = function () {
      $scope.limit += 4;
    };
  })

  .controller("cartCtrl", function ($scope) {
    $scope.tinhTongTien = function () {
      var tong = 0;
      for (const item of $scope.$parent.cart) {
        tong = tong + item.price_discount * item.soluong;
      }
      return tong;
      console.log(tong);
    };
    $scope.xoa = function (id) {
      // $scope.$parent.cart = $scope.$parent.cart.splice(id,1);
      $scope.$parent.cart = $scope.$parent.cart.filter((sp) => sp.id != id);
    };
  })

  .controller("chitietSPCtrl", function ($scope, $routeParams, $rootScope) {
    var id = $routeParams.id;
    $scope.sanpham = $scope.$parent.listSP.filter((sp) => sp.id == id)[0];
  });