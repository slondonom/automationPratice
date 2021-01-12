@tag2
Feature: The user login page and created blog category and Post associated with category
  Scenario Outline: Created blog category and Post with category created
    Given The user login in the page
    When creating the blog category
      |<categoryName>|<nameVietnamese>|<nameRussian>|<nameArabic>|<nameFarsi>|<nameTurkish>|<nameFrench>|<nameSpanish>|<nameGerman>|
    And creat Post with category created
      |<postTitle>|<text>|<categoryName>|
    When verify category
      |<postTitle>|
    Examples:
      |categoryName|nameVietnamese|nameRussian|nameArabic|nameFarsi|nameTurkish|nameFrench|nameSpanish|nameGerman|postTitle|text|
      | test-php-2-2|vietnamese|Russian|Arabic | Farsi  | turkish | french | spanish | german  | tittle about test1 | test enable |

