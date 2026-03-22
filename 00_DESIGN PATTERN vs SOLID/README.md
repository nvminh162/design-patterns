# Design Pattern vs SOLID (de hieu, de ap dung)

Tai lieu nay giup ban phan biet:

- SOLID la nguyen tac thiet ke
- Design Pattern la mau giai phap

## 1) SOLID va Design Pattern khac nhau o dau?

### SOLID la gi?

SOLID la 5 nguyen tac de to chuc code de:

- de doc
- de mo rong
- de bao tri
- giam sua code cu moi khi co yeu cau moi

5 nguyen tac gom: SRP, OCP, LSP, ISP, DIP.

### Design Pattern la gi?

Design Pattern la cac "cong thuc" giai quyet bai toan thiet ke lap di lap lai.

Vi du: Strategy, Factory, Observer, Decorator...

### Nho nhanh

- SOLID = luat thiet ke (nguyen tac)
- Pattern = cach trien khai (mau giai phap)

Hai thu nay bo tro nhau, khong doi lap nhau.

## 2) Vi du trong project nay (OCP)

Trong thu muc JavaScript co 3 buoc:

- `01_problem`: Ban dau chi co mua bang vang.
- `02_bad`: Co them yeu cau moi (mua bang tien), ta sua truc tiep class cu -> class phinh to, if/else nhieu, moi lan mo rong lai sua code cu.
- `03_solusion`: Tach logic theo cach thanh toan (vang, tien...) -> them kieu moi ma khong can sua logic cu qua nhieu.

Day chinh la tinh than cua OCP:

- Open for extension: Co the mo rong them tinh nang.
- Closed for modification: Han che sua code dang on dinh.

## 3) Cach hoc nhanh voi repo nay

1. Chay `01_problem/s.js` de hieu bai toan ban dau.
2. Chay `02_bad/s1.js` va `02_bad/s2.js` de thay van de khi mo rong.
3. Chay `03_solusion/s.js` de thay cach lam tot hon theo huong OCP.

## 4) Ket luan

- Dung SOLID de dinh huong cach viet code.
- Dung Design Pattern de giai quyet bai toan cu the.
- Khi code can mo rong lien tuc, uu tien cach thiet ke theo OCP som de tranh "dap di xay lai".