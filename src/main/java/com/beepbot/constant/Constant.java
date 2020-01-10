package com.beepbot.constant;

public class Constant {

	public static final String WEATHERSTATUS = null;
	public static final String NEWSTATUS = null;
	public static final String LOCATION = "location";
	public static final String BEEPBOTCHAT = "beepbotchat";
	public static final String NEWS = "news";
	public static String WEATHER_URL = "https://api.darksky.net/forecast/";
	public static String NEWS_URL = "https://newsapi.org/v2/top-headlines?country=";

	public static final String INSERT_DATA_IN_COUNTRY ="INSERT INTO country (id,country,code) VALUES \n" + 
			"(1, 'Argentina' , 'ar'),\n" + 
			"(2, 'Australia' , 'au'),\n" + 
			"(3, 'Austria' , 'at'),\n" +
			"(4, 'Belgium' , 'be'),\n"+
			"(5, 'Brazil' , 'br'),\n"+
			"(6, 'Bulgaria' , 'bg'),\n"+
			"(7, 'Canada' , 'ca'),\n"+
			"(8, 'China' , 'cn'),\n"+
			"(9, 'Colombia' , 'co'),\n"+
			"(10, 'Cuba' , 'cu'),\n"+
			"(11, 'Czech Republic' , 'cz'),\n"+
			"(12, 'Egypt' , 'eg'),\n"+
			"(13, 'France' , 'fr'),\n"+
			"(14, 'Germany' , 'de'),\n"+
			"(15, 'Greece' , 'gr'),\n"+
			"(16, 'Hong Kong' , 'hk'),\n"+
			"(17, 'Hungary' , 'hu'),\n"+
			"(18, 'India' , 'in'),\n"+
			"(19, 'Indonesia' , 'id'),\n"+
			"(20, 'Ireland' , 'ie'),\n"+
			"(21, 'Israel' , 'il'),\n"+
			"(22, 'Italy' , 'it'),\n"+
			"(23, 'Japan' , 'jp'),\n"+
			"(24, 'Latvia' , 'lv'),\n"+
			"(25, 'Lithuania' , 'lt'),\n"+
			"(26, 'Malaysia' , 'my'),\n"+
			"(27, 'Mexico' , 'mx'),\n"+
			"(28, 'Morocco' , 'ma'),\n"+
			"(29, 'Netherlands' , 'nl'),\n"+
			"(30, 'New Zealand' , 'nz'),\n"+
			"(31, 'Nigeria' , 'ng'),\n"+
			"(32, 'Norway' , 'no'),\n"+
			"(33, 'Philippines' , 'ph'),\n"+
			"(34, 'Poland' , 'pl'),\n"+
			"(35, 'Portugal' , 'pt'),\n"+
			"(36, 'Romania' , 'ro'),\n"+
			"(37, 'Russia' , 'ru'),\n"+
			"(38, 'Saudi Arabia' , 'sa'),\n"+
			"(39, 'Serbia' , 'rs'),\n"+
			"(40, 'Singapore' , 'sg'),\n"+
			"(41, 'Slovakia' , 'sk'),\n"+
			"(42, 'Slovenia' , 'si'),\n"+
			"(43, 'South Africa' , 'za'),\n"+
			"(44, 'South Korea' , 'kr'),\n"+
			"(45, 'Sweden' , 'se'),\n"+
			"(46, 'Switzerland' , 'ch'),\n"+
			"(47, 'Taiwan' , 'tw'),\n"+
			"(48, 'Thailand' , 'th'),\n"+
			"(49, 'Turkey' , 'tr'),\n"+
			"(50, 'UAE' , 'ae'),\n"+
			"(51, 'Ukraine' , 'ua'),\n"+
			"(52, 'United Kingdom' , 'gb'),\n"+
			"(53, 'United States' , 'us'),\n"+
			"(54, 'Venuzuela' , 've');";
//	public static final String INSERT_DATA_IN_COUNTRY = "INSERT INTO country (country, code, descriptor, uncode, id) VALUES \n" + 
//			"('Afghanistan', 'AF', 'AFG', 4, 1),\n" + 
//			"('Aland Islands', 'AX', 'ALA', 248, 2),\n" + 
//			"('Albania', 'AL', 'ALB', 8, 3),\n" + 
//			"('Algeria', 'DZ', 'DZA', 12, 4),\n" + 
//			"('American Samoa', 'AS', 'ASM', 16, 5),\n" + 
//			"('Andorra', 'AD', 'AND', 20, 6),\n" + 
//			"('Angola', 'AO', 'AGO', 24, 7),\n" + 
//			"('Anguilla', 'AI', 'AIA', 660, 8),\n" + 
//			"('Antarctica', 'AQ', 'ATA', 10, 9),\n" + 
//			"('Antigua and Barbuda', 'AG', 'ATG', 28, 10), \n" + 
//			"('Argentina', 'AR', 'ARG', 32, 11), \n" + 
//			"('Armenia', 'AM', 'ARM', 51, 12), \n" + 
//			"('Aruba', 'AW', 'ABW', 533, 13) ,\n" + 
//			"('Australia', 'AU', 'AUS', 36, 14),\n" + 
//			"('Austria', 'AT', 'AUT', 40, 15), \n" + 
//			"('Azerbaijan', 'AZ', 'AZE', 31, 16), \n" + 
//			"('Bahamas', 'BS', 'BHS', 44, 17), \n" + 
//			"('Bahrain', 'BH', 'BHR', 48, 18), \n" + 
//			"('Bangladesh', 'BD', 'BGD', 50, 19), \n" + 
//			"('Barbados', 'BB', 'BRB', 52, 20), \n" + 
//			"('Belarus', 'BY', 'BLR', 112, 21), \n" + 
//			"('Belgium', 'BE', 'BEL', 56, 22) ,\n" + 
//			"('Belize', 'BZ', 'BLZ', 84, 23), \n" + 
//			"('Benin', 'BJ', 'BEN', 204, 24), \n" + 
//			"('Bermuda', 'BM', 'BMU', 60, 25),\n" + 
//			"('Bhutan', 'BT', 'BTN', 64, 26) ,\n" + 
//			"('Bolivia', 'BO', 'BOL', '68', 27), \n" + 
//			"('Bosnia and Herzegovina', 'BA', 'BIH', 70, 28), \n" + 
//			"('Botswana', 'BW', 'BWA', 72, 29), \n" + 
//			"('Bouvet Island', 'BV', 'BVT', 74, 30), \n" + 
//			"('Brazil', 'BR', 'BRA', 76, 31) ,\n" + 
//			"('British Virgin Islands', 'VG', 'VGB', 92, 32), \n" + 
//			"('British Indian Ocean Territory', 'IO', 'IOT', 86, 33), \n" + 
//			"('Brunei Darussalam', 'BN', 'BRN', 96, 34),\n" + 
//			"('Bulgaria', 'BG', 'BGR', 100, 35), \n" + 
//			"('Burkina Faso', 'BF', 'BFA', 854, 36), \n" + 
//			"('Burundi', 'BI', 'BDI', 108, 37) ,\n" + 
//			"('Cambodia', 'KH', 'KHM', 116, 38) ,\n" + 
//			"('Cameroon', 'CM', 'CMR', 120, 39) ,\n" + 
//			"('Canada', 'CA', 'CAN', 124, 40), \n" + 
//			"('Cape Verde', 'CV', 'CPV', 132, 41), \n" + 
//			"('Cayman Islands', 'KY', 'CYM', 136, 42) ,\n" + 
//			"('Central African Republic', 'CF', 'CAF', 140, 43) ,\n" + 
//			"('Chad', 'TD', 'TCD', 148, 44) ,\n" + 
//			"('Chile', 'CL', 'CHL', 152, 45) ,\n" + 
//			"('China', 'CN', 'CHN', 156, 46) ,\n" + 
//			"('Hong Kong, SAR China', 'HK', 'HKG', 344, 47), \n" + 
//			"('Macao, SAR China', 'MO', 'MAC', 446, 48) ,\n" + 
//			"('Christmas Island', 'CX', 'CXR', 162, 49) ,\n" + 
//			"('Cocos (Keeling) Islands', 'CC', 'CCK', 166, 50) ,\n" + 
//			"('Colombia', 'CO', 'COL', 170, 51) ,\n" + 
//			"('Comoros', 'KM', 'COM', 174, 52) ,\n" + 
//			"('Congo (Brazzaville)', 'CG', 'COG', 178, 53), \n" + 
//			"('Congo, (Kinshasa)', 'CD', 'COD', 180, 54), \n" + 
//			"('Cook Islands', 'CK', 'COK', 184, 55), \n" + 
//			"('Costa Rica', 'CR', 'CRI', 188, 56), \n" + 
//			"('Côte d\\\\Ivoire', 'CI', 'CIV', 384, 57), \n" + 
//			"('Croatia', 'HR', 'HRV', 191, 58), \n" + 
//			"('Cuba', 'CU', 'CUB', 192, 59), \n" + 
//			"('Cyprus', 'CY', 'CYP', 196, 60), \n" + 
//			"('Czech Republic', 'CZ', 'CZE', 203, 61), \n" + 
//			"('Denmark', 'DK', 'DNK', 208, 62) ,\n" + 
//			"('Djibouti', 'DJ', 'DJI', 262, 63), \n" + 
//			"('Dominica', 'DM', 'DMA', 212, 64), \n" + 
//			"('Dominican Republic', 'DO', 'DOM', 214, 65),\n" + 
//			"('Ecuador', 'EC', 'ECU', 218, 66) ,\n" + 
//			"('Egypt', 'EG', 'EGY', 818, 67), \n" + 
//			"('El Salvador', 'SV', 'SLV', 222, 68), \n" + 
//			"('Equatorial Guinea', 'GQ', 'GNQ', 226, 69), \n" + 
//			"('Eritrea', 'ER', 'ERI', 232, 70), \n" + 
//			"('Estonia', 'EE', 'EST', 233, 71) ,\n" + 
//			"('Ethiopia', 'ET', 'ETH', 231, 72), \n" + 
//			"('Falkland Islands (Malvinas)', 'FK', 'FLK', 238, 73), \n" + 
//			"('Faroe Islands', 'FO', 'FRO', 234, 74) ,\n" + 
//			"('Fiji', 'FJ', 'FJI', 242, 75) ,\n" + 
//			"('Finland', 'FI', 'FIN', 246, 76), \n" + 
//			"('France', 'FR', 'FRA', 250, 77) ,\n" + 
//			"('French Guiana', 'GF', 'GUF', 254, 78), \n" + 
//			"('French Polynesia', 'PF', 'PYF', 258, 79), \n" + 
//			"('French Southern Territories', 'TF', 'ATF', 260, 80), \n" + 
//			"('Gabon', 'GA', 'GAB', 266, 81) ,\n" + 
//			"('Gambia', 'GM', 'GMB', 270, 82) ,\n" + 
//			"('Georgia', 'GE', 'GEO', 268, 83) ,\n" + 
//			"('Germany', 'DE', 'DEU', 276, 84) ,\n" + 
//			"('Ghana', 'GH', 'GHA', 288, 85), \n" + 
//			"('Gibraltar', 'GI', 'GIB', 292, 86), \n" + 
//			"('Greece', 'GR', 'GRC', 300, 87), \n" + 
//			"('Greenland', 'GL', 'GRL', 304, 88), \n" + 
//			"('Grenada', 'GD', 'GRD', 308, 89), \n" + 
//			"('Guadeloupe', 'GP', 'GLP', 312, 90), \n" + 
//			"('Guam', 'GU', 'GUM', 316, 91) ,\n" + 
//			"('Guatemala', 'GT', 'GTM', 320, 92), \n" + 
//			"('Guernsey', 'GG', 'GGY', 831, 93) ,\n" + 
//			"('Guinea', 'GN', 'GIN', 324, 94) ,\n" + 
//			"('Guinea-Bissau', 'GW', 'GNB', 624, 95), \n" + 
//			"('Guyana', 'GY', 'GUY', 328, 96) ,\n" + 
//			"('Haiti', 'HT', 'HTI', 332, 97) ,\n" + 
//			"('Heard and Mcdonald Islands', 'HM', 'HMD', 334, 98) ,\n" + 
//			"('Holy See (Vatican City State)', 'VA', 'VAT', 336, 99), \n" + 
//			"('Honduras', 'HN', 'HND', 340, 100) ,\n" + 
//			"('Hungary', 'HU', 'HUN', 348, 101), \n" + 
//			"('Iceland', 'IS', 'ISL', 352, 102) ,\n" + 
//			"('India', 'IN', 'IND', 356, 103) ,\n" + 
//			"('Indonesia', 'ID', 'IDN', 360, 104), \n" + 
//			"('Iran, Islamic Republic of', 'IR', 'IRN', 364, 105), \n" + 
//			"('Iraq', 'IQ', 'IRQ', 368, 106), \n" + 
//			"('Ireland', 'IE', 'IRL', 372, 107), \n" + 
//			"('Isle of Man', 'IM', 'IMN', 833, 108), \n" + 
//			"('Israel', 'IL', 'ISR', 376, 109), \n" + 
//			"('Italy', 'IT', 'ITA', 380, 110), \n" + 
//			"('Jamaica', 'JM', 'JAM', 388, 111), \n" + 
//			"('Japan', 'JP', 'JPN', 392, 112), \n" + 
//			"('Jersey', 'JE', 'JEY', 832, 113), \n" + 
//			"('Jordan', 'JO', 'JOR', 400, 114) ,\n" + 
//			"('Kazakhstan', 'KZ', 'KAZ', 398, 115), \n" + 
//			"('Kenya', 'KE', 'KEN', 404, 116), \n" + 
//			"('Kiribati', 'KI', 'KIR', 296, 117), \n" + 
//			"('Korea (North)', 'KP', 'PRK', 408, 118), \n" + 
//			"('Korea (South)', 'KR', 'KOR', 410, 119), \n" + 
//			"('Kuwait', 'KW', 'KWT', 414, 120) ,\n" + 
//			"('Kyrgyzstan', 'KG', 'KGZ', 417, 121), \n" + 
//			"('Lao PDR', 'LA', 'LAO', 418, 122), \n" + 
//			"('Latvia', 'LV', 'LVA', 428, 123), \n" + 
//			"('Lebanon', 'LB', 'LBN', 422, 124), \n" + 
//			"('Lesotho', 'LS', 'LSO', 426, 125) ,\n" + 
//			"('Liberia', 'LR', 'LBR', 430, 126), \n" + 
//			"('Libya', 'LY', 'LBY', 434, 127), \n" + 
//			"('Liechtenstein', 'LI', 'LIE', 438, 128), \n" + 
//			"('Lithuania', 'LT', 'LTU', 440, 129), \n" + 
//			"('Luxembourg', 'LU', 'LUX', 442, 130), \n" + 
//			"('Macedonia, Republic of', 'MK', 'MKD', 807, 131), \n" + 
//			"('Madagascar', 'MG', 'MDG', 450, 132) ,\n" + 
//			"('Malawi', 'MW', 'MWI', 454, 133), \n" + 
//			"('Malaysia', 'MY', 'MYS', 458, 134), \n" + 
//			"('Maldives', 'MV', 'MDV', 462, 135), \n" + 
//			"('Mali', 'ML', 'MLI', 466, 136), \n" + 
//			"('Malta', 'MT', 'MLT', 470, 137), \n" + 
//			"('Marshall Islands', 'MH', 'MHL', 584, 138), \n" + 
//			"('Martinique', 'MQ', 'MTQ', 474, 139), \n" + 
//			"('Mauritania', 'MR', 'MRT', 478, 140), \n" + 
//			"('Mauritius', 'MU', 'MUS', 480, 141), \n" + 
//			"('Mayotte', 'YT', 'MYT', 175, 142), \n" + 
//			"('Mexico', 'MX', 'MEX', 484, 143), \n" + 
//			"('Micronesia, Federated States of', 'FM', 'FSM', 583, 144) ,\n" + 
//			"('Moldova', 'MD', 'MDA', 498, 145), \n" + 
//			"('Monaco', 'MC', 'MCO', 492, 146), \n" + 
//			"('Mongolia', 'MN', 'MNG', 496, 147), \n" + 
//			"('Montenegro', 'ME', 'MNE', 499, 148), \n" + 
//			"('Montserrat', 'MS', 'MSR', 500, 149), \n" + 
//			"('Morocco', 'MA', 'MAR', 504, 150) ,\n" + 
//			"('Mozambique', 'MZ', 'MOZ', 508, 151), \n" + 
//			"('Myanmar', 'MM', 'MMR', 104, 152), \n" + 
//			"('Namibia', 'NA', 'NAM', 516, 153), \n" + 
//			"('Nauru', 'NR', 'NRU', 520, 154) ,\n" + 
//			"('Nepal', 'NP', 'NPL', 524, 155), \n" + 
//			"('Netherlands', 'NL', 'NLD', 528, 156), \n" + 
//			"('Netherlands Antilles', 'AN', 'ANT', 530, 157), \n" + 
//			"('New Caledonia', 'NC', 'NCL', 540, 158), \n" + 
//			"('New Zealand', 'NZ', 'NZL', 554, 159) ,\n" + 
//			"('Nicaragua', 'NI', 'NIC', 558, 160) ,\n" + 
//			"('Niger', 'NE', 'NER', 562, 161), \n" + 
//			"('Nigeria', 'NG', 'NGA', 566, 162), \n" + 
//			"('Niue', 'NU', 'NIU', 570, 163) ,\n" + 
//			"('Norfolk Island', 'NF', 'NFK', 574, 164), \n" + 
//			"('Northern Mariana Islands', 'MP', 'MNP', 580, 165), \n" + 
//			"('Norway', 'NO', 'NOR', 578, 166) ,\n" + 
//			"('Oman', 'OM', 'OMN', 512, 167), \n" + 
//			"('Pakistan', 'PK', 'PAK', 586, 168), \n" + 
//			"('Palau', 'PW', 'PLW', 585, 169), \n" + 
//			"('Palestinian Territory', 'PS', 'PSE', 275, 170), \n" + 
//			"('Panama', 'PA', 'PAN', 591, 171) ,\n" + 
//			"('Papua New Guinea', 'PG', 'PNG', 598, 172), \n" + 
//			"('Paraguay', 'PY', 'PRY', 600, 173) ,\n" + 
//			"('Peru', 'PE', 'PER', 604, 174) ,\n" + 
//			"('Philippines', 'PH', 'PHL', 608, 175), \n" + 
//			"('Pitcairn', 'PN', 'PCN', 612, 176), \n" + 
//			"('Poland', 'PL', 'POL', 616, 177) ,\n" + 
//			"('Portugal', 'PT', 'PRT', 620, 178), \n" + 
//			"('Puerto Rico', 'PR', 'PRI', 630, 179), \n" + 
//			"('Qatar', 'QA', 'QAT', 634, 180) ,\n" + 
//			"('Réunion', 'RE', 'REU', 638, 181), \n" + 
//			"('Romania', 'RO', 'ROU', 642, 182) ,\n" + 
//			"('Russian Federation', 'RU', 'RUS', 643, 183), \n" + 
//			"('Rwanda', 'RW', 'RWA', 646, 184) ,\n" + 
//			"('Saint-Barthélemy', 'BL', 'BLM', 652, 185), \n" + 
//			"('Saint Helena', 'SH', 'SHN', 654, 186), \n" + 
//			"('Saint Kitts and Nevis', 'KN', 'KNA', 659, 187), \n" + 
//			"('Saint Lucia', 'LC', 'LCA', 662, 188), \n" + 
//			"('Saint-Martin (French part)', 'MF', 'MAF', 663, 189), \n" + 
//			"('Saint Pierre and Miquelon', 'PM', 'SPM', 666, 190) ,\n" + 
//			"('Saint Vincent and Grenadines', 'VC', 'VCT', 670, 191), \n" + 
//			"('Samoa', 'WS', 'WSM', 882, 192) ,\n" + 
//			"('San Marino', 'SM', 'SMR', 674, 193), \n" + 
//			"('Sao Tome and Principe', 'ST', 'STP', 678, 194), \n" + 
//			"('Saudi Arabia', 'SA', 'SAU', 682, 195) ,\n" + 
//			"('Senegal', 'SN', 'SEN', 686, 196), \n" + 
//			"('Serbia', 'RS', 'SRB', 688, 197), \n" + 
//			"('Seychelles', 'SC', 'SYC', 690, 198), \n" + 
//			"('Sierra Leone', 'SL', 'SLE', 694, 199), \n" + 
//			"('Singapore', 'SG', 'SGP', 702, 200), \n" + 
//			"('Slovakia', 'SK', 'SVK', 703, 201), \n" + 
//			"('Slovenia', 'SI', 'SVN', 705, 202) ,\n" + 
//			"('Solomon Islands', 'SB', 'SLB', 90, 203), \n" + 
//			"('Somalia', 'SO', 'SOM', 706, 204) ,\n" + 
//			"('South Africa', 'ZA', 'ZAF', 710, 205), \n" + 
//			"('South Georgia and the South Sandwich Islands', 'GS', 'SGS', 239, 206), \n" + 
//			"('South Sudan', 'SS', 'SSD', 728, 207) ,\n" + 
//			"('Spain', 'ES', 'ESP', 724, 208) ,\n" + 
//			"('Sri Lanka', 'LK', 'LKA', 144, 209) ,\n" + 
//			"('Sudan', 'SD', 'SDN', 736, 210) ,\n" + 
//			"('Suriname', 'SR', 'SUR', 740, 211), \n" + 
//			"('Svalbard and Jan Mayen Islands', 'SJ', 'SJM', 744, 212), \n" + 
//			"('Swaziland', 'SZ', 'SWZ', 748, 213), \n" + 
//			"('Sweden', 'SE', 'SWE', 752, 214), \n" + 
//			"('Switzerland', 'CH', 'CHE', 756, 215), \n" + 
//			"('Syrian Arab Republic (Syria)', 'SY', 'SYR', 760, 216), \n" + 
//			"('Taiwan, Republic of China', 'TW', 'TWN', 158, 217), \n" + 
//			"('Tajikistan', 'TJ', 'TJK', 762, 218), \n" + 
//			"('Tanzania, United Republic of', 'TZ', 'TZA', 834, 219), \n" + 
//			"('Thailand', 'TH', 'THA', 764, 220) ,\n" + 
//			"('Timor-Leste', 'TL', 'TLS', 626, 221), \n" + 
//			"('Togo', 'TG', 'TGO', 768, 222), \n" + 
//			"('Tokelau', 'TK', 'TKL', 772, 223), \n" + 
//			"('Tonga', 'TO', 'TON', 776, 224), \n" + 
//			"('Trinidad and Tobago', 'TT', 'TTO', 780, 225), \n" + 
//			"('Tunisia', 'TN', 'TUN', 788, 226), \n" + 
//			"('Turkey', 'TR', 'TUR', 792, 227), \n" + 
//			"('Turkmenistan', 'TM', 'TKM', 795, 228),\n" + 
//			"('Turks and Caicos Islands', 'TC', 'TCA', 796, 229), \n" + 
//			"('Tuvalu', 'TV', 'TUV', 798, 230) ,\n" + 
//			"('Uganda', 'UG', 'UGA', 800, 231), \n" + 
//			"('Ukraine', 'UA', 'UKR', 804, 232), \n" + 
//			"('United Arab Emirates', 'AE', 'ARE', 784, 233), \n" + 
//			"('United Kingdom', 'GB', 'GBR', 826, 234), \n" + 
//			"('United States of America', 'US', 'USA', 840, 235), \n" + 
//			"('US Minor Outlying Islands', 'UM', 'UMI', 581, 236), \n" + 
//			"('Uruguay', 'UY', 'URY', 858, 237), \n" + 
//			"('Uzbekistan', 'UZ', 'UZB', 860, 238), \n" + 
//			"('Vanuatu', 'VU', 'VUT', 548, 239),\n" + 
//			"('Venezuela (Bolivarian Republic)', 'VE', 'VEN', 862, 240), \n" + 
//			"('Viet Nam', 'VN', 'VNM', 704, 241), \n" + 
//			"('Virgin Islands, US', 'VI', 'VIR', 850, 242), \n" + 
//			"('Wallis and Futuna Islands', 'WF', 'WLF', 876, 243) ,\n" + 
//			"('Western Sahara', 'EH', 'ESH', 732, 244), \n" + 
//			"('Yemen', 'YE', 'YEM', 887, 245), \n" + 
//			"('Zambia', 'ZM', 'ZMB', 894, 246),\n" + 
//			"('Zimbabwe', 'ZW', 'ZWE', 716, 247);\n";
}
