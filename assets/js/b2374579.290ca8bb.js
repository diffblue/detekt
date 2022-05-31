"use strict";(self.webpackChunkdetekt_website=self.webpackChunkdetekt_website||[]).push([[1119],{3905:function(e,t,n){n.d(t,{Zo:function(){return f},kt:function(){return d}});var o=n(7294);function r(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function i(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var o=Object.getOwnPropertySymbols(e);t&&(o=o.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,o)}return n}function l(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?i(Object(n),!0).forEach((function(t){r(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):i(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}function a(e,t){if(null==e)return{};var n,o,r=function(e,t){if(null==e)return{};var n,o,r={},i=Object.keys(e);for(o=0;o<i.length;o++)n=i[o],t.indexOf(n)>=0||(r[n]=e[n]);return r}(e,t);if(Object.getOwnPropertySymbols){var i=Object.getOwnPropertySymbols(e);for(o=0;o<i.length;o++)n=i[o],t.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(e,n)&&(r[n]=e[n])}return r}var u=o.createContext({}),c=function(e){var t=o.useContext(u),n=t;return e&&(n="function"==typeof e?e(t):l(l({},t),e)),n},f=function(e){var t=c(e.components);return o.createElement(u.Provider,{value:t},e.children)},p={inlineCode:"code",wrapper:function(e){var t=e.children;return o.createElement(o.Fragment,{},t)}},s=o.forwardRef((function(e,t){var n=e.components,r=e.mdxType,i=e.originalType,u=e.parentName,f=a(e,["components","mdxType","originalType","parentName"]),s=c(n),d=r,m=s["".concat(u,".").concat(d)]||s[d]||p[d]||i;return n?o.createElement(m,l(l({ref:t},f),{},{components:n})):o.createElement(m,l({ref:t},f))}));function d(e,t){var n=arguments,r=t&&t.mdxType;if("string"==typeof e||r){var i=n.length,l=new Array(i);l[0]=s;var a={};for(var u in t)hasOwnProperty.call(t,u)&&(a[u]=t[u]);a.originalType=e,a.mdxType="string"==typeof e?e:r,l[1]=a;for(var c=2;c<i;c++)l[c]=n[c];return o.createElement.apply(null,l)}return o.createElement.apply(null,n)}s.displayName="MDXCreateElement"},240:function(e,t,n){n.r(t),n.d(t,{assets:function(){return f},contentTitle:function(){return u},default:function(){return d},frontMatter:function(){return a},metadata:function(){return c},toc:function(){return p}});var o=n(3117),r=n(102),i=(n(7294),n(3905)),l=["components"],a={title:"Howto: build upon the default yaml config file",published:!0,permalink:"howto-buildupondefaultconfig.html",summary:"Use the new feature to rely on the opinionated default yaml configuration file.",tags:["guides"]},u=void 0,c={permalink:"/blog/2019/03/03/build-upon-the-default-config",editUrl:"https://github.com/detekt/detekt/edit/main/website/blog/2019-03-03-build-upon-the-default-config.md",source:"@site/blog/2019-03-03-build-upon-the-default-config.md",title:"Howto: build upon the default yaml config file",description:"A common use case of detekt users was to build upon the default config file and use a second config file to override",date:"2019-03-03T00:00:00.000Z",formattedDate:"March 3, 2019",tags:[{label:"guides",permalink:"/blog/tags/guides"}],readingTime:.67,truncated:!1,authors:[],frontMatter:{title:"Howto: build upon the default yaml config file",published:!0,permalink:"howto-buildupondefaultconfig.html",summary:"Use the new feature to rely on the opinionated default yaml configuration file.",tags:["guides"]},prevItem:{title:"Howto: migrating from the *test-pattern*",permalink:"/blog/2019/06/08/migrating-the-test-pattern"},nextItem:{title:"Howto: configure detekt for gradle root project",permalink:"/blog/2019/03/03/configure-detekt-on-root-project"}},f={authorsImageUrls:[]},p=[],s={toc:p};function d(e){var t=e.components,n=(0,r.Z)(e,l);return(0,i.kt)("wrapper",(0,o.Z)({},s,n,{components:t,mdxType:"MDXLayout"}),(0,i.kt)("p",null,"A common use case of ",(0,i.kt)("em",{parentName:"p"},"detekt")," users was to build upon the default config file and use a second config file to override\nsome defaults.\nSpeaking in ",(0,i.kt)("em",{parentName:"p"},"Gradle")," terms, this could look like following:"),(0,i.kt)("pre",null,(0,i.kt)("code",{parentName:"pre",className:"language-gradle"},'detekt {\n    ...\n    config = files(\n            project.rootDir.resolve("config/default-detekt-config.yml"),\n            project.rootDir.resolve("config/our.yml")\n    )\n    baseline = project.rootDir.resolve("config/baseline.xml")\n    ...\n}\n')),(0,i.kt)("p",null,"Starting from RC13, two new commandline flags got introduced:"),(0,i.kt)("ul",null,(0,i.kt)("li",{parentName:"ul"},(0,i.kt)("inlineCode",{parentName:"li"},"--fail-fast")),(0,i.kt)("li",{parentName:"ul"},"and ",(0,i.kt)("inlineCode",{parentName:"li"},"--build-upon-default-config")),(0,i.kt)("li",{parentName:"ul"},"(",(0,i.kt)("inlineCode",{parentName:"li"},"buildUponDefaultConfig")," and ",(0,i.kt)("inlineCode",{parentName:"li"},"failFast")," properties for gradle setup)")),(0,i.kt)("p",null,"Both options allow us to use the distributed ",(0,i.kt)("inlineCode",{parentName:"p"},"default-detekt-config.yml")," as the backup configuration when\nno rule configuration is found in the specified configuration (",(0,i.kt)("inlineCode",{parentName:"p"},"--config")," or ",(0,i.kt)("inlineCode",{parentName:"p"},"config = ..."),").",(0,i.kt)("br",{parentName:"p"}),"\n","This allows us to simplify our detekt setup without copy-pasting a huge config file:"),(0,i.kt)("pre",null,(0,i.kt)("code",{parentName:"pre",className:"language-gradle"},'detekt {\n    ...\n    buildUponDefaultConfig = true\n    config = files(project.rootDir.resolve("config/our.yml"))\n    baseline = project.rootDir.resolve("config/baseline.xml")\n    ...\n}\n')),(0,i.kt)("p",null,"{% include links.html %}"))}d.isMDXComponent=!0}}]);