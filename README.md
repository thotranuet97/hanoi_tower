#PicApp - Ứng dụng quản lý và chia sẻ ảnh
Giới thiệu 
==========

1. **Tên sản phẩm:** PicApp

2. **Công nghệ sử dụng:**  Ruby on Rails 5 (Mô hình MVC), Bootstrap 4, Mysql2...


Cài đặt môi trường
==================
### Hướng dẫn cài đặt dưới đây thực hiện trên môi trường hệ điều hành Ubuntu/Linux. Bạn có thể giả lập môi trường hoặc cài đặt trên chính hệ điều hành bạn đang sử dụng, tìm hiểu thêm tại các trang web uy tín: 

*https://www.codehub.vn/

*https://viblo.asia/

...

**1. Cài đặt môi trường Ubuntu**

* Download Ubuntu 14.04 tại đây: http://www.ubuntu.com/download/desktop

* Cách cài đặt tham khảo tại đây: http://vforum.vn/diendan/showthread.php?56703-Huong-dan-cach-tao-usb-cai-dat-ubuntu

**2. Cài đặt Ruby on rails**

**B1:** Mở Terminal -> Edit -> Profile Preferences -> Title and Command -> click Run command as a login shell.

**B2:** Cài git và curl

* sudo apt-get update

* sudo apt-get -y install git

* sudo apt-get -y install curl

**B3:** Cài RVM

* curl -L get.rvm.io | bash -s stable

* source ~/.rvm/scripts/rvm

Xem các gói cần thiết cho RVM

* rvm requirements

**B4:** Cài các gói cần thiết

* sudo apt-get -y install build-essential openssl libreadline6 libreadline6-dev

* sudo apt-get -y install zlib1g zlib1g-dev libssl-dev libyaml-dev libsqlite3-0

* sudo apt-get -y install libsqlite3-dev sqlite3 libxml2-dev libmysqlclient-dev

* sudo apt-get -y install libxslt-dev autoconf libc6-dev ncurses-dev automake libtool bison subversion

* sudo apt-get -y install nodejs

**B5:** Cài Ruby và Rails

* rvm install 2.3.1

* rvm use 2.3.1 --default

* gem install rails

Cách sử dụng RVM (Ruby Version Manager) tham khảo tại đây: https://rvm.io/workflow/projects

**3. Cài đặt database - Mysql**

**B1:** Cài mysql trên ubuntu

* sudo apt-get -y install mysql-server mysql-client

**B2:** Cài phpmyadmin trên ubuntu

* sudo apt-get -y install phpmyadmin

**Gõ lệnh**

* sudo nano /etc/apache2/apache2.conf

**Thêm dòng sau vào cuối**

*Include /etc/phpmyadmin/apache.conf

**B3:** Khởi động lại apache

* sudo service apache2 restart

**B4:** Truy cập vào phpmyadmin qua đường dẫn

* localhost/phpmyadmin

