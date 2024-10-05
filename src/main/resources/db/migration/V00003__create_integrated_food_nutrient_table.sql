-- 식품의약품안전처_통합식품영양성분정보_20240925.csv
create table food_nutrient.integrated_food_nutrient
(
    food_cd           varchar(255) not null
        primary key,
    ash               varchar(255),
    ca                varchar(255),
    cartb             varchar(255),
    chocdf            varchar(255),
    chole             varchar(255),
    company_nm        varchar(255),
    coo_cd            varchar(255),
    coo_nm            varchar(255),
    crt_ymd           varchar(255),
    crtr_ymd          varchar(255),
    data_cd           varchar(255),
    data_prod_cd      varchar(255),
    data_prod_nm      varchar(255),
    enerc             varchar(255),
    fasat             varchar(255),
    fatce             varchar(255),
    fatrn             varchar(255),
    fe                varchar(255),
    fibtg             varchar(255),
    food_nm           varchar(255),
    food_size         varchar(255),
    impt_yn           varchar(255),
    imptr_nm          varchar(255),
    item_mnftr_rpt_no varchar(255),
    k                 varchar(255),
    mkr_nm            varchar(255),
    nat               varchar(255),
    nia               varchar(255),
    nut_con_srtr_qua  varchar(255),
    p                 varchar(255),
    prot              varchar(255),
    refuse            varchar(255),
    retol             varchar(255),
    ribf              varchar(255),
    rtl_bzenty_nm     varchar(255),
    src_cd            varchar(255),
    src_nm            varchar(255),
    sugar             varchar(255),
    thia              varchar(255),
    type_nm           varchar(255),
    vita_rae          varchar(255),
    vitc              varchar(255),
    vitd              varchar(255),
    water             varchar(255)
);

comment on column food_nutrient.integrated_food_nutrient.food_cd is '식품코드';

comment on column food_nutrient.integrated_food_nutrient.ash is '회분(g)';

comment on column food_nutrient.integrated_food_nutrient.ca is '칼슘(mg)';

comment on column food_nutrient.integrated_food_nutrient.cartb is '베타카로틴(μg)';

comment on column food_nutrient.integrated_food_nutrient.chocdf is '탄수화물(g)';

comment on column food_nutrient.integrated_food_nutrient.chole is '콜레스테롤(mg)';

comment on column food_nutrient.integrated_food_nutrient.company_nm is '업체명';

comment on column food_nutrient.integrated_food_nutrient.coo_cd is '원산지국코드';

comment on column food_nutrient.integrated_food_nutrient.coo_nm is '원산지국명';

comment on column food_nutrient.integrated_food_nutrient.crt_ymd is '데이터생성일자';

comment on column food_nutrient.integrated_food_nutrient.crtr_ymd is '데이터기준일자';

comment on column food_nutrient.integrated_food_nutrient.data_cd is '데이터구분코드';

comment on column food_nutrient.integrated_food_nutrient.data_prod_cd is '데이터생성방법코드';

comment on column food_nutrient.integrated_food_nutrient.data_prod_nm is '데이터생성방법명';

comment on column food_nutrient.integrated_food_nutrient.enerc is '에너지(kcal)';

comment on column food_nutrient.integrated_food_nutrient.fasat is '포화지방산(g)';

comment on column food_nutrient.integrated_food_nutrient.fatce is '지방(g)';

comment on column food_nutrient.integrated_food_nutrient.fatrn is '트랜스지방산(g)';

comment on column food_nutrient.integrated_food_nutrient.fe is '철(mg)';

comment on column food_nutrient.integrated_food_nutrient.fibtg is '식이섬유(g)';

comment on column food_nutrient.integrated_food_nutrient.food_nm is '식품명';

comment on column food_nutrient.integrated_food_nutrient.food_size is '식품중량';

comment on column food_nutrient.integrated_food_nutrient.impt_yn is '수입여부';

comment on column food_nutrient.integrated_food_nutrient.imptr_nm is '수입업체명';

comment on column food_nutrient.integrated_food_nutrient.item_mnftr_rpt_no is '품목제조보고번호';

comment on column food_nutrient.integrated_food_nutrient.k is '칼륨(mg)';

comment on column food_nutrient.integrated_food_nutrient.mkr_nm is '제조사명';

comment on column food_nutrient.integrated_food_nutrient.nat is '나트륨(mg)';

comment on column food_nutrient.integrated_food_nutrient.nia is '니아신(mg)';

comment on column food_nutrient.integrated_food_nutrient.nut_con_srtr_qua is '영양성분함량기준량';

comment on column food_nutrient.integrated_food_nutrient.p is '인(mg)';

comment on column food_nutrient.integrated_food_nutrient.prot is '단백질(g)';

comment on column food_nutrient.integrated_food_nutrient.refuse is '폐기율(%)';

comment on column food_nutrient.integrated_food_nutrient.retol is '레티놀(μg)';

comment on column food_nutrient.integrated_food_nutrient.ribf is '리보플라빈(mg)';

comment on column food_nutrient.integrated_food_nutrient.rtl_bzenty_nm is '유통업체명';

comment on column food_nutrient.integrated_food_nutrient.src_cd is '출처코드';

comment on column food_nutrient.integrated_food_nutrient.src_nm is '출처명';

comment on column food_nutrient.integrated_food_nutrient.sugar is '당류(g)';

comment on column food_nutrient.integrated_food_nutrient.thia is '티아민(mg)';

comment on column food_nutrient.integrated_food_nutrient.type_nm is '데이터구분명';

comment on column food_nutrient.integrated_food_nutrient.vita_rae is '비타민 A(μg RAE)';

comment on column food_nutrient.integrated_food_nutrient.vitc is '비타민 C(mg)';

comment on column food_nutrient.integrated_food_nutrient.vitd is '비타민 D(μg)';

comment on column food_nutrient.integrated_food_nutrient.water is '수분(g)';


