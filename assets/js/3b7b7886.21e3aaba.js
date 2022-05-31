"use strict";(self.webpackChunkdetekt_website=self.webpackChunkdetekt_website||[]).push([[9697],{3905:function(e,t,n){n.d(t,{Zo:function(){return p},kt:function(){return m}});var r=n(7294);function o(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function a(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(e);t&&(r=r.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,r)}return n}function i(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?a(Object(n),!0).forEach((function(t){o(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):a(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}function s(e,t){if(null==e)return{};var n,r,o=function(e,t){if(null==e)return{};var n,r,o={},a=Object.keys(e);for(r=0;r<a.length;r++)n=a[r],t.indexOf(n)>=0||(o[n]=e[n]);return o}(e,t);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);for(r=0;r<a.length;r++)n=a[r],t.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(e,n)&&(o[n]=e[n])}return o}var l=r.createContext({}),u=function(e){var t=r.useContext(l),n=t;return e&&(n="function"==typeof e?e(t):i(i({},t),e)),n},p=function(e){var t=u(e.components);return r.createElement(l.Provider,{value:t},e.children)},c={inlineCode:"code",wrapper:function(e){var t=e.children;return r.createElement(r.Fragment,{},t)}},d=r.forwardRef((function(e,t){var n=e.components,o=e.mdxType,a=e.originalType,l=e.parentName,p=s(e,["components","mdxType","originalType","parentName"]),d=u(n),m=o,f=d["".concat(l,".").concat(m)]||d[m]||c[m]||a;return n?r.createElement(f,i(i({ref:t},p),{},{components:n})):r.createElement(f,i({ref:t},p))}));function m(e,t){var n=arguments,o=t&&t.mdxType;if("string"==typeof e||o){var a=n.length,i=new Array(a);i[0]=d;var s={};for(var l in t)hasOwnProperty.call(t,l)&&(s[l]=t[l]);s.originalType=e,s.mdxType="string"==typeof e?e:o,i[1]=s;for(var u=2;u<a;u++)i[u]=n[u];return r.createElement.apply(null,i)}return r.createElement.apply(null,n)}d.displayName="MDXCreateElement"},9726:function(e,t,n){n.r(t),n.d(t,{assets:function(){return p},contentTitle:function(){return l},default:function(){return m},frontMatter:function(){return s},metadata:function(){return u},toc:function(){return c}});var r=n(3117),o=n(102),a=(n(7294),n(3905)),i=["components"],s={title:"Howto: migrating from the *test-pattern*",published:!0,permalink:"howto-migratetestpattern.html",summary:"Starting with RC15 the test-pattern is obsolete. This post shows how to leverage rule path excludes to achieve the same functionality.",tags:["guides"]},l=void 0,u={permalink:"/blog/2019/06/08/migrating-the-test-pattern",editUrl:"https://github.com/detekt/detekt/edit/main/website/blog/2019-06-08-migrating-the-test-pattern.md",source:"@site/blog/2019-06-08-migrating-the-test-pattern.md",title:"Howto: migrating from the *test-pattern*",description:"Starting with RC15 the test-pattern is obsolete. This post shows how to leverage rule path excludes to achieve the same functionality.",date:"2019-06-08T00:00:00.000Z",formattedDate:"June 8, 2019",tags:[{label:"guides",permalink:"/blog/tags/guides"}],readingTime:1.425,truncated:!1,authors:[],frontMatter:{title:"Howto: migrating from the *test-pattern*",published:!0,permalink:"howto-migratetestpattern.html",summary:"Starting with RC15 the test-pattern is obsolete. This post shows how to leverage rule path excludes to achieve the same functionality.",tags:["guides"]},prevItem:{title:"Howto: using snapshot releases of detekt",permalink:"/blog/2019/06/29/using-detekt-snapshots"},nextItem:{title:"Howto: build upon the default yaml config file",permalink:"/blog/2019/03/03/build-upon-the-default-config"}},p={authorsImageUrls:[]},c=[],d={toc:c};function m(e){var t=e.components,n=(0,o.Z)(e,i);return(0,a.kt)("wrapper",(0,r.Z)({},d,n,{components:t,mdxType:"MDXLayout"}),(0,a.kt)("p",null,"Starting with RC15 the test-pattern is obsolete. This post shows how to leverage rule path excludes to achieve the same functionality."),(0,a.kt)("p",null,"With version < RC15 the configuration file allowed to specify\nwhich paths should be mapped to test files so detekt would not run\nspecific rule sets and rules on these test files:"),(0,a.kt)("pre",null,(0,a.kt)("code",{parentName:"pre",className:"language-yaml"},"test-pattern: # Configure exclusions for test sources\n  active: true\n  patterns: # Test file regexes\n    - '.*/test/.*'\n    - '.*Test.kt'\n    - '.*Spec.kt'\n  exclude-rule-sets:\n    - 'comments'\n  exclude-rules:\n    - 'NamingRules'\n    - 'WildcardImport'\n    - 'MagicNumber'\n    - 'MaxLineLength'\n    - 'LateinitUsage'\n    - 'StringLiteralDuplication'\n    - 'SpreadOperator'\n    - 'TooManyFunctions'\n")),(0,a.kt)("p",null,"This was an okay approach as we nowadays separate production code and test code.\nHowever more different kinds of source files can be identified.\nFor example generated and library code."),(0,a.kt)("p",null,"With the new approach of offering path patterns on the rule and rule set level the user has much more freedom\nin defining which rule should run on which path."),(0,a.kt)("p",null,"If we do not care about documented test classes because we write our test code\nin a ",(0,a.kt)("em",{parentName:"p"},"documenting way"),", we could simply exclude the ",(0,a.kt)("inlineCode",{parentName:"p"},"comments")," rule set for following patterns:"),(0,a.kt)("pre",null,(0,a.kt)("code",{parentName:"pre"},'comments:\n  ...\n  excludes: "**/*Test.kt, **/*Spec.kt"\n')),(0,a.kt)("p",null,"If we for example do not care about ",(0,a.kt)("inlineCode",{parentName:"p"},"MagicNumber"),"'s in test code, we can\nexclude our test files for this rule:"),(0,a.kt)("pre",null,(0,a.kt)("code",{parentName:"pre"},'style:\n  ...\n  MagicNumber:\n    excludes: "**/*Test.kt, **/*Spec.kt"\n')),(0,a.kt)("p",null,"Make sure to use globing patterns here as detekt does not support regular expressions anymore.\nThis change was done to make use of the ",(0,a.kt)("inlineCode",{parentName:"p"},"java.nio.file")," library when handling os-specific paths."),(0,a.kt)("p",null,"If you were using the default detekt configuration with the default test-pattern,\nyou will not notice any changes when upgrading to >= RC15.\nAll ",(0,a.kt)("em",{parentName:"p"},"exclude-rules")," and ",(0,a.kt)("em",{parentName:"p"},"exclude-rule-sets")," will now make use of ",(0,a.kt)("inlineCode",{parentName:"p"},'excludes: "**/test/**,**/*Test.kt,**/*Spec.kt"'),"."))}m.isMDXComponent=!0}}]);