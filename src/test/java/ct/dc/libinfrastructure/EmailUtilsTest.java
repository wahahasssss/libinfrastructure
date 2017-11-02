package ct.dc.libinfrastructure;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by CTWLPC on 2017/10/12.
 */
public class EmailUtilsTest {
    String content = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
            "  <title>公共库.html</title>\n" +
            "  <meta name=\"generator\" content=\"Haroopad 0.13.1\" />\n" +
            "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "\n" +
            "  <style>div.oembedall-githubrepos{border:1px solid #DDD;border-radius:4px;list-style-type:none;margin:0 0 10px;padding:8px 10px 0;font:13.34px/1.4 helvetica,arial,freesans,clean,sans-serif;width:452px;background-color:#fff}div.oembedall-githubrepos .oembedall-body{background:-moz-linear-gradient(center top,#FAFAFA,#EFEFEF);background:-webkit-gradient(linear,left top,left bottom,from(#FAFAFA),to(#EFEFEF));border-bottom-left-radius:4px;border-bottom-right-radius:4px;border-top:1px solid #EEE;margin-left:-10px;margin-top:8px;padding:5px 10px;width:100%}div.oembedall-githubrepos h3{font-size:14px;margin:0;padding-left:18px;white-space:nowrap}div.oembedall-githubrepos p.oembedall-description{color:#444;font-size:12px;margin:0 0 3px}div.oembedall-githubrepos p.oembedall-updated-at{color:#888;font-size:11px;margin:0}div.oembedall-githubrepos ul.oembedall-repo-stats{border:none;float:right;font-size:11px;font-weight:700;padding-left:15px;position:relative;z-index:5;margin:0}div.oembedall-githubrepos ul.oembedall-repo-stats li{border:none;color:#666;display:inline-block;list-style-type:none;margin:0!important}div.oembedall-githubrepos ul.oembedall-repo-stats li a{background-color:transparent;border:none;color:#666!important;background-position:5px -2px;background-repeat:no-repeat;border-left:1px solid #DDD;display:inline-block;height:21px;line-height:21px;padding:0 5px 0 23px}div.oembedall-githubrepos ul.oembedall-repo-stats li:first-child a{border-left:medium none;margin-right:-3px}div.oembedall-githubrepos ul.oembedall-repo-stats li a:hover{background:5px -27px no-repeat #4183C4;color:#FFF!important;text-decoration:none}div.oembedall-githubrepos ul.oembedall-repo-stats li:first-child a:hover{border-bottom-left-radius:3px;border-top-left-radius:3px}ul.oembedall-repo-stats li:last-child a:hover{border-bottom-right-radius:3px;border-top-right-radius:3px}span.oembedall-closehide{background-color:#aaa;border-radius:2px;cursor:pointer;margin-right:3px}div.oembedall-container{margin-top:5px;text-align:left}.oembedall-ljuser{font-weight:700}.oembedall-ljuser img{vertical-align:bottom;border:0;padding-right:1px}.oembedall-stoqembed{border-bottom:1px dotted #999;float:left;overflow:hidden;width:730px;line-height:1;background:#FFF;color:#000;font-family:Arial,Liberation Sans,DejaVu Sans,sans-serif;font-size:80%;text-align:left;margin:0;padding:0}.oembedall-stoqembed a{color:#07C;text-decoration:none;margin:0;padding:0}.oembedall-stoqembed a:hover{text-decoration:underline}.oembedall-stoqembed a:visited{color:#4A6B82}.oembedall-stoqembed h3{font-family:Trebuchet MS,Liberation Sans,DejaVu Sans,sans-serif;font-size:130%;font-weight:700;margin:0;padding:0}.oembedall-stoqembed .oembedall-reputation-score{color:#444;font-size:120%;font-weight:700;margin-right:2px}.oembedall-stoqembed .oembedall-user-info{height:35px;width:185px}.oembedall-stoqembed .oembedall-user-info .oembedall-user-gravatar32{float:left;height:32px;width:32px}.oembedall-stoqembed .oembedall-user-info .oembedall-user-details{float:left;margin-left:5px;overflow:hidden;white-space:nowrap;width:145px}.oembedall-stoqembed .oembedall-question-hyperlink{font-weight:700}.oembedall-stoqembed .oembedall-stats{background:#EEE;margin:0 0 0 7px;padding:4px 7px 6px;width:58px}.oembedall-stoqembed .oembedall-statscontainer{float:left;margin-right:8px;width:86px}.oembedall-stoqembed .oembedall-votes{color:#555;padding:0 0 7px;text-align:center}.oembedall-stoqembed .oembedall-vote-count-post{font-size:240%;color:#808185;display:block;font-weight:700}.oembedall-stoqembed .oembedall-views{color:#999;padding-top:4px;text-align:center}.oembedall-stoqembed .oembedall-status{margin-top:-3px;padding:4px 0;text-align:center;background:#75845C;color:#FFF}.oembedall-stoqembed .oembedall-status strong{color:#FFF;display:block;font-size:140%}.oembedall-stoqembed .oembedall-summary{float:left;width:635px}.oembedall-stoqembed .oembedall-excerpt{line-height:1.2;margin:0;padding:0 0 5px}.oembedall-stoqembed .oembedall-tags{float:left;line-height:18px}.oembedall-stoqembed .oembedall-tags a:hover{text-decoration:none}.oembedall-stoqembed .oembedall-post-tag{background-color:#E0EAF1;border-bottom:1px solid #3E6D8E;border-right:1px solid #7F9FB6;color:#3E6D8E;font-size:90%;line-height:2.4;margin:2px 2px 2px 0;padding:3px 4px;text-decoration:none;white-space:nowrap}.oembedall-stoqembed .oembedall-post-tag:hover{background-color:#3E6D8E;border-bottom:1px solid #37607D;border-right:1px solid #37607D;color:#E0EAF1}.oembedall-stoqembed .oembedall-fr{float:right}.oembedall-stoqembed .oembedall-statsarrow{background-image:url(http://cdn.sstatic.net/stackoverflow/img/sprites.png?v=3);background-repeat:no-repeat;overflow:hidden;background-position:0 -435px;float:right;height:13px;margin-top:12px;width:7px}.oembedall-facebook1{border:1px solid #1A3C6C;padding:0;font:13.34px/1.4 verdana;width:500px}.oembedall-facebook2{background-color:#627add}.oembedall-facebook2 a{color:#e8e8e8;text-decoration:none}.oembedall-facebookBody{background-color:#fff;vertical-align:top;padding:5px}.oembedall-facebookBody .contents{display:inline-block;width:100%}.oembedall-facebookBody div img{float:left;margin-right:5px}div.oembedall-lanyard{-webkit-box-shadow:none;-webkit-transition-delay:0s;-webkit-transition-duration:.4000000059604645s;-webkit-transition-property:width;-webkit-transition-timing-function:cubic-bezier(0.42,0,.58,1);background-attachment:scroll;background-clip:border-box;background-color:transparent;background-image:none;background-origin:padding-box;border-width:0;box-shadow:none;color:#112644;display:block;float:left;font-family:'Trebuchet MS',Trebuchet,sans-serif;font-size:16px;height:253px;line-height:19px;margin:0;max-width:none;min-height:0;outline:#112644 0;overflow-x:visible;overflow-y:visible;padding:0;position:relative;text-align:left;vertical-align:baseline;width:804px}div.oembedall-lanyard .tagline{font-size:1.5em}div.oembedall-lanyard .wrapper{overflow:hidden;clear:both}div.oembedall-lanyard .split{float:left;display:inline}div.oembedall-lanyard .prominent-place .flag:active,div.oembedall-lanyard .prominent-place .flag:focus,div.oembedall-lanyard .prominent-place .flag:hover,div.oembedall-lanyard .prominent-place .flag:link,div.oembedall-lanyard .prominent-place .flag:visited{float:left;display:block;width:48px;height:48px;position:relative;top:-5px;margin-right:10px}div.oembedall-lanyard .place-context{font-size:.889em}div.oembedall-lanyard .prominent-place .sub-place{display:block}div.oembedall-lanyard .prominent-place{font-size:1.125em;line-height:1.1em;font-weight:400}div.oembedall-lanyard .main-date{color:#8CB4E0;font-weight:700;line-height:1.1}div.oembedall-lanyard .first{width:48.57%;margin:0 0 0 2.857%}.mermaid .label{color:#333}.node circle,.node polygon,.node rect{fill:#cde498;stroke:#13540c;stroke-width:1px}.edgePath .path{stroke:green;stroke-width:1.5px}.cluster rect{fill:#cdffb2;rx:40;stroke:#6eaa49;stroke-width:1px}.cluster text{fill:#333}.actor{stroke:#13540c;fill:#cde498}text.actor{fill:#000;stroke:none}.actor-line{stroke:grey}.messageLine0{stroke-width:1.5;stroke-dasharray:\"2 2\";marker-end:\"url(#arrowhead)\";stroke:#333}.messageLine1{stroke-width:1.5;stroke-dasharray:\"2 2\";stroke:#333}#arrowhead{fill:#333}#crosshead path{fill:#333!important;stroke:#333!important}.messageText{fill:#333;stroke:none}.labelBox{stroke:#326932;fill:#cde498}.labelText,.loopText{fill:#000;stroke:none}.loopLine{stroke-width:2;stroke-dasharray:\"2 2\";marker-end:\"url(#arrowhead)\";stroke:#326932}.note{stroke:#6eaa49;fill:#fff5ad}.noteText{fill:#000;stroke:none;font-family:'trebuchet ms',verdana,arial;font-size:14px}.section{stroke:none;opacity:.2}.section0,.section2{fill:#6eaa49}.section1,.section3{fill:#fff;opacity:.2}.sectionTitle0,.sectionTitle1,.sectionTitle2,.sectionTitle3{fill:#333}.sectionTitle{text-anchor:start;font-size:11px;text-height:14px}.grid .tick{stroke:lightgrey;opacity:.3;shape-rendering:crispEdges}.grid path{stroke-width:0}.today{fill:none;stroke:red;stroke-width:2px}.task{stroke-width:2}.taskText{text-anchor:middle;font-size:11px}.taskTextOutsideRight{fill:#000;text-anchor:start;font-size:11px}.taskTextOutsideLeft{fill:#000;text-anchor:end;font-size:11px}.taskText0,.taskText1,.taskText2,.taskText3{fill:#fff}.task0,.task1,.task2,.task3{fill:#487e3a;stroke:#13540c}.taskTextOutside0,.taskTextOutside1,.taskTextOutside2,.taskTextOutside3{fill:#000}.active0,.active1,.active2,.active3{fill:#cde498;stroke:#13540c}.activeText0,.activeText1,.activeText2,.activeText3{fill:#000!important}.done0,.done1,.done2,.done3{stroke:grey;fill:lightgrey;stroke-width:2}.doneText0,.doneText1,.doneText2,.doneText3{fill:#000!important}.crit0,.crit1,.crit2,.crit3{stroke:#f88;fill:red;stroke-width:2}.activeCrit0,.activeCrit1,.activeCrit2,.activeCrit3{stroke:#f88;fill:#cde498;stroke-width:2}.doneCrit0,.doneCrit1,.doneCrit2,.doneCrit3{stroke:#f88;fill:lightgrey;stroke-width:2;cursor:pointer;shape-rendering:crispEdges}.activeCritText0,.activeCritText1,.activeCritText2,.activeCritText3,.doneCritText0,.doneCritText1,.doneCritText2,.doneCritText3{fill:#000!important}.titleText{text-anchor:middle;font-size:18px;fill:#000}text{font-family:'trebuchet ms',verdana,arial;font-size:14px}html{height:100%}body{margin:0!important;padding:5px 20px 26px!important;background-color:#fff;font-family:\"Lucida Grande\",\"Segoe UI\",\"Apple SD Gothic Neo\",\"Malgun Gothic\",\"Lucida Sans Unicode\",Helvetica,Arial,sans-serif;font-size:.9em;overflow-x:hidden;overflow-y:auto}br,h1,h2,h3,h4,h5,h6{clear:both}hr.page{background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAYAAAAECAYAAACtBE5DAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyJpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBNYWNpbnRvc2giIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6OENDRjNBN0E2NTZBMTFFMEI3QjRBODM4NzJDMjlGNDgiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6OENDRjNBN0I2NTZBMTFFMEI3QjRBODM4NzJDMjlGNDgiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDo4Q0NGM0E3ODY1NkExMUUwQjdCNEE4Mzg3MkMyOUY0OCIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDo4Q0NGM0E3OTY1NkExMUUwQjdCNEE4Mzg3MkMyOUY0OCIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PqqezsUAAAAfSURBVHjaYmRABcYwBiM2QSA4y4hNEKYDQxAEAAIMAHNGAzhkPOlYAAAAAElFTkSuQmCC) repeat-x;border:0;height:3px;padding:0}hr.underscore{border-top-style:dashed!important}body >:first-child{margin-top:0!important}img.plugin{box-shadow:0 1px 3px rgba(0,0,0,.1);border-radius:3px}iframe{border:0}figure{-webkit-margin-before:0;-webkit-margin-after:0;-webkit-margin-start:0;-webkit-margin-end:0}kbd{border:1px solid #aaa;-moz-border-radius:2px;-webkit-border-radius:2px;border-radius:2px;-moz-box-shadow:1px 2px 2px #ddd;-webkit-box-shadow:1px 2px 2px #ddd;box-shadow:1px 2px 2px #ddd;background-color:#f9f9f9;background-image:-moz-linear-gradient(top,#eee,#f9f9f9,#eee);background-image:-o-linear-gradient(top,#eee,#f9f9f9,#eee);background-image:-webkit-linear-gradient(top,#eee,#f9f9f9,#eee);background-image:linear-gradient(top,#eee,#f9f9f9,#eee);padding:1px 3px;font-family:inherit;font-size:.85em}.oembeded .oembed_photo{display:inline-block}img[data-echo]{margin:25px 0;width:100px;height:100px;background:url(../img/ajax.gif) center center no-repeat #fff}.spinner{display:inline-block;width:10px;height:10px;margin-bottom:-.1em;border:2px solid rgba(0,0,0,.5);border-top-color:transparent;border-radius:100%;-webkit-animation:spin 1s infinite linear;animation:spin 1s infinite linear}.spinner:after{content:'';display:block;width:0;height:0;position:absolute;top:-6px;left:0;border:4px solid transparent;border-bottom-color:rgba(0,0,0,.5);-webkit-transform:rotate(45deg);transform:rotate(45deg)}@-webkit-keyframes spin{to{-webkit-transform:rotate(360deg)}}@keyframes spin{to{transform:rotate(360deg)}}p.toc{margin:0!important}p.toc ul{padding-left:10px}p.toc>ul{padding:10px;margin:0 10px;display:inline-block;border:1px solid #ededed;border-radius:5px}p.toc li,p.toc ul{list-style-type:none}p.toc li{width:100%;padding:0;overflow:hidden}p.toc li a::after{content:\".\"}p.toc li a:before{content:\"• \"}p.toc h5{text-transform:uppercase}p.toc .title{float:left;padding-right:3px}p.toc .number{margin:0;float:right;padding-left:3px;background:#fff;display:none}input.task-list-item{margin-left:-1.62em}.markdown{font-family:\"Hiragino Sans GB\",\"Microsoft YaHei\",STHeiti,SimSun,\"Lucida Grande\",\"Lucida Sans Unicode\",\"Lucida Sans\",'Segoe UI',AppleSDGothicNeo-Medium,'Malgun Gothic',Verdana,Tahoma,sans-serif;padding:20px}.markdown a{text-decoration:none;vertical-align:baseline}.markdown a:hover{text-decoration:underline}.markdown h1{font-size:2.2em;font-weight:700;margin:1.5em 0 1em}.markdown h2{font-size:1.8em;font-weight:700;margin:1.275em 0 .85em}.markdown h3{font-size:1.6em;font-weight:700;margin:1.125em 0 .75em}.markdown h4{font-size:1.4em;font-weight:700;margin:.99em 0 .66em}.markdown h5{font-size:1.2em;font-weight:700;margin:.855em 0 .57em}.markdown h6{font-size:1em;font-weight:700;margin:.75em 0 .5em}.markdown h1+p,.markdown h1:first-child,.markdown h2+p,.markdown h2:first-child,.markdown h3+p,.markdown h3:first-child,.markdown h4+p,.markdown h4:first-child,.markdown h5+p,.markdown h5:first-child,.markdown h6+p,.markdown h6:first-child{margin-top:0}.markdown hr{border:1px solid #ccc}.markdown p{margin:1em 0;word-wrap:break-word}.markdown ol{list-style-type:decimal}.markdown li{display:list-item;line-height:1.4em}.markdown blockquote{margin:1em 20px}.markdown blockquote>:first-child{margin-top:0}.markdown blockquote>:last-child{margin-bottom:0}.markdown blockquote cite:before{content:'\\2014 \\00A0'}.markdown .code{border-radius:3px;word-wrap:break-word}.markdown pre{border-radius:3px;word-wrap:break-word;border:1px solid #ccc;overflow:auto;padding:.5em}.markdown pre code{border:0;display:block}.markdown pre>code{font-family:Consolas,Inconsolata,Courier,monospace;font-weight:700;white-space:pre;margin:0}.markdown code{border-radius:3px;word-wrap:break-word;border:1px solid #ccc;padding:0 5px;margin:0 2px}.markdown img{max-width:100%}.markdown mark{color:#000;background-color:#fcf8e3}.markdown table{padding:0;border-collapse:collapse;border-spacing:0;margin-bottom:16px}.markdown table tr td,.markdown table tr th{border:1px solid #ccc;margin:0;padding:6px 13px}.markdown table tr th{font-weight:700}.markdown table tr th>:first-child{margin-top:0}.markdown table tr th>:last-child{margin-bottom:0}.markdown table tr td>:first-child{margin-top:0}.markdown table tr td>:last-child{margin-bottom:0}@import url(http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,300,700);.haroopad{padding:20px;color:#222;font-size:15px;font-family:\"Roboto Condensed\",Tauri,\"Hiragino Sans GB\",\"Microsoft YaHei\",STHeiti,SimSun,\"Lucida Grande\",\"Lucida Sans Unicode\",\"Lucida Sans\",'Segoe UI',AppleSDGothicNeo-Medium,'Malgun Gothic',Verdana,Tahoma,sans-serif;background:#fff;line-height:1.6;-webkit-font-smoothing:antialiased}.haroopad a{color:#3269a0}.haroopad a:hover{color:#4183c4}.haroopad h2{border-bottom:1px solid #e6e6e6}.haroopad h6{color:#777}.haroopad hr{border:1px solid #e6e6e6}.haroopad blockquote>code,.haroopad h1>code,.haroopad h2>code,.haroopad h3>code,.haroopad h4>code,.haroopad h5>code,.haroopad h6>code,.haroopad li>code,.haroopad p>code,.haroopad td>code{font-family:Consolas,\"Liberation Mono\",Menlo,Courier,monospace;font-size:85%;background-color:rgba(0,0,0,.02);padding:.2em .5em;border:1px solid #efefef}.haroopad pre>code{font-size:1em;letter-spacing:-1px;font-weight:700}.haroopad blockquote{border-left:4px solid #e6e6e6;padding:0 15px;color:#777}.haroopad table{background-color:#fafafa}.haroopad table tr td,.haroopad table tr th{border:1px solid #e6e6e6}.haroopad table tr:nth-child(2n){background-color:#f2f2f2}.hljs{display:block;overflow-x:auto;padding:.5em;background:#fdf6e3;color:#657b83;-webkit-text-size-adjust:none}.diff .hljs-header,.hljs-comment,.hljs-doctype,.hljs-javadoc,.hljs-pi,.lisp .hljs-string{color:#93a1a1}.css .hljs-tag,.hljs-addition,.hljs-keyword,.hljs-request,.hljs-status,.hljs-winutils,.method,.nginx .hljs-title{color:#859900}.hljs-command,.hljs-dartdoc,.hljs-hexcolor,.hljs-link_url,.hljs-number,.hljs-phpdoc,.hljs-regexp,.hljs-rules .hljs-value,.hljs-string,.hljs-tag .hljs-value,.tex .hljs-formula{color:#2aa198}.css .hljs-function,.hljs-built_in,.hljs-chunk,.hljs-decorator,.hljs-id,.hljs-identifier,.hljs-localvars,.hljs-title,.vhdl .hljs-literal{color:#268bd2}.hljs-attribute,.hljs-class .hljs-title,.hljs-constant,.hljs-link_reference,.hljs-parent,.hljs-type,.hljs-variable,.lisp .hljs-body,.smalltalk .hljs-number{color:#b58900}.css .hljs-pseudo,.diff .hljs-change,.hljs-attr_selector,.hljs-cdata,.hljs-header,.hljs-pragma,.hljs-preprocessor,.hljs-preprocessor .hljs-keyword,.hljs-shebang,.hljs-special,.hljs-subst,.hljs-symbol,.hljs-symbol .hljs-string{color:#cb4b16}.hljs-deletion,.hljs-important{color:#dc322f}.hljs-link_label{color:#6c71c4}.tex .hljs-formula{background:#eee8d5}.MathJax_Hover_Frame{border-radius:.25em;-webkit-border-radius:.25em;-moz-border-radius:.25em;-khtml-border-radius:.25em;box-shadow:0 0 15px #83A;-webkit-box-shadow:0 0 15px #83A;-moz-box-shadow:0 0 15px #83A;-khtml-box-shadow:0 0 15px #83A;border:1px solid #A6D!important;display:inline-block;position:absolute}.MathJax_Hover_Arrow{position:absolute;width:15px;height:11px;cursor:pointer}#MathJax_About{position:fixed;left:50%;width:auto;text-align:center;border:3px outset;padding:1em 2em;background-color:#DDD;color:#000;cursor:default;font-family:message-box;font-size:120%;font-style:normal;text-indent:0;text-transform:none;line-height:normal;letter-spacing:normal;word-spacing:normal;word-wrap:normal;white-space:nowrap;float:none;z-index:201;border-radius:15px;-webkit-border-radius:15px;-moz-border-radius:15px;-khtml-border-radius:15px;box-shadow:0 10px 20px gray;-webkit-box-shadow:0 10px 20px gray;-moz-box-shadow:0 10px 20px gray;-khtml-box-shadow:0 10px 20px gray;filter:progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}.MathJax_Menu{position:absolute;background-color:#fff;color:#000;width:auto;padding:2px;border:1px solid #CCC;margin:0;cursor:default;font:menu;text-align:left;text-indent:0;text-transform:none;line-height:normal;letter-spacing:normal;word-spacing:normal;word-wrap:normal;white-space:nowrap;float:none;z-index:201;box-shadow:0 10px 20px gray;-webkit-box-shadow:0 10px 20px gray;-moz-box-shadow:0 10px 20px gray;-khtml-box-shadow:0 10px 20px gray;filter:progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}.MathJax_MenuItem{padding:2px 2em;background:0 0}.MathJax_MenuArrow{position:absolute;right:.5em;color:#666}.MathJax_MenuActive .MathJax_MenuArrow{color:#fff}.MathJax_MenuArrow.RTL{left:.5em;right:auto}.MathJax_MenuCheck{position:absolute;left:.7em}.MathJax_MenuCheck.RTL{right:.7em;left:auto}.MathJax_MenuRadioCheck{position:absolute;left:1em}.MathJax_MenuRadioCheck.RTL{right:1em;left:auto}.MathJax_MenuLabel{padding:2px 2em 4px 1.33em;font-style:italic}.MathJax_MenuRule{border-top:1px solid #CCC;margin:4px 1px 0}.MathJax_MenuDisabled{color:GrayText}.MathJax_MenuActive{background-color:Highlight;color:HighlightText}.MathJax_Menu_Close{position:absolute;width:31px;height:31px;top:-15px;left:-15px}#MathJax_Zoom{position:absolute;background-color:#F0F0F0;overflow:auto;display:block;z-index:301;padding:.5em;border:1px solid #000;margin:0;font-weight:400;font-style:normal;text-align:left;text-indent:0;text-transform:none;line-height:normal;letter-spacing:normal;word-spacing:normal;word-wrap:normal;white-space:nowrap;float:none;box-shadow:5px 5px 15px #AAA;-webkit-box-shadow:5px 5px 15px #AAA;-moz-box-shadow:5px 5px 15px #AAA;-khtml-box-shadow:5px 5px 15px #AAA;filter:progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}#MathJax_ZoomOverlay{position:absolute;left:0;top:0;z-index:300;display:inline-block;width:100%;height:100%;border:0;padding:0;margin:0;background-color:#fff;opacity:0;filter:alpha(opacity=0)}#MathJax_ZoomFrame{position:relative;display:inline-block;height:0;width:0}#MathJax_ZoomEventTrap{position:absolute;left:0;top:0;z-index:302;display:inline-block;border:0;padding:0;margin:0;background-color:#fff;opacity:0;filter:alpha(opacity=0)}.MathJax_Preview{color:#888}#MathJax_Message{position:fixed;left:1px;bottom:2px;background-color:#E6E6E6;border:1px solid #959595;margin:0;padding:2px 8px;z-index:102;color:#000;font-size:80%;width:auto;white-space:nowrap}#MathJax_MSIE_Frame{position:absolute;top:0;left:0;width:0;z-index:101;border:0;margin:0;padding:0}.MathJax_Error{color:#C00;font-style:italic}footer{position:fixed;font-size:.8em;text-align:right;bottom:0;margin-left:-25px;height:20px;width:100%}</style>\n" +
            "</head>\n" +
            "<body class=\"markdown haroopad\">\n" +
            "<h3 id=\"基础库文档\"><a name=\"基础库文档\" href=\"#基础库文档\"></a>基础库文档</h3><h4 id=\"1：常量库\"><a name=\"1：常量库\" href=\"#1：常量库\"></a>1：常量库</h4><h5 id=\"1、aeskeyconst\"><a name=\"1、aeskeyconst\" href=\"#1、aeskeyconst\"></a>1、AesKeyConst</h5><pre><code data-origin=\"<pre><code>PASSWD_KEY\n" +
            "</code></pre>\">PASSWD_KEY\n" +
            "</code></pre><h5 id=\"2、encodingconst\"><a name=\"2、encodingconst\" href=\"#2、encodingconst\"></a>2、EncodingConst</h5><pre><code data-origin=\"<pre><code>UTF8\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "GBK\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "GB2312\n" +
            "</code></pre>\">UTF8\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "GBK\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "GB2312\n" +
            "</code></pre><h5 id=\"3、stringconst\"><a name=\"3、stringconst\" href=\"#3、stringconst\"></a>3、StringConst</h5><pre><code data-origin=\"<pre><code>EMPTY  &quot;&quot;\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "UNKNOWN &quot;unknown&quot;\n" +
            "</code></pre>\">EMPTY  \"\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "UNKNOWN \"unknown\"\n" +
            "</code></pre><h5 id=\"4、httpcodeconst\"><a name=\"4、httpcodeconst\" href=\"#4、httpcodeconst\"></a>4、HttpCodeConst</h5><pre><code data-origin=\"<pre><code>OK 200\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "MOVED_PERMANENTLY 301\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "FOUND  302\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "NOTMODIFIED 304\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "TEMPORARY_REDIRECT 307\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "BADREQUEST  400\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "NOTFOUND 404\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "FORBIDDEN 403\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "UNAUTHORIZED 401\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "INTERNAL_SERVER_ERROR  500\n" +
            "\n" +
            "\n" +
            "\n" +
            "BAD_GATEWAY 502\n" +
            "\n" +
            "\n" +
            "\n" +
            "SERVER_UNAVAILABLE 503\n" +
            "\n" +
            "\n" +
            "\n" +
            "GATEWAY_TIMEOUT 504\n" +
            "\n" +
            "\n" +
            "\n" +
            "HTTP_VERSION_NOT_SUPPORTED 505\n" +
            "</code></pre>\">OK 200\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "MOVED_PERMANENTLY 301\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "FOUND  302\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "NOTMODIFIED 304\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "TEMPORARY_REDIRECT 307\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "BADREQUEST  400\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "NOTFOUND 404\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "FORBIDDEN 403\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "UNAUTHORIZED 401\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "INTERNAL_SERVER_ERROR  500\n" +
            "\n" +
            "\n" +
            "\n" +
            "BAD_GATEWAY 502\n" +
            "\n" +
            "\n" +
            "\n" +
            "SERVER_UNAVAILABLE 503\n" +
            "\n" +
            "\n" +
            "\n" +
            "GATEWAY_TIMEOUT 504\n" +
            "\n" +
            "\n" +
            "\n" +
            "HTTP_VERSION_NOT_SUPPORTED 505\n" +
            "</code></pre><h4 id=\"2:基础工具库\"><a name=\"2:基础工具库\" href=\"#2:基础工具库\"></a>2:基础工具库</h4><h5 id=\"1、commonutils：\"><a name=\"1、commonutils：\" href=\"#1、commonutils：\"></a>1、CommonUtils：</h5><pre><code data-origin=\"<pre><code>堆栈信息等公共信息\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static void getStackErrors(Throwable ex)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String getProjectsRootPath()\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String getOperationSystemName()\n" +
            "</code></pre>\">堆栈信息等公共信息\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static void getStackErrors(Throwable ex)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String getProjectsRootPath()\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String getOperationSystemName()\n" +
            "</code></pre><h5 id=\"2、compressedutils:\"><a name=\"2、compressedutils:\" href=\"#2、compressedutils:\"></a>2、CompressedUtils:</h5><pre><code data-origin=\"<pre><code>1、gzip 压缩算法\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static byte[] gzipCompressToBytes(String inputStr,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static String gzipCompress(String inputStr,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static String gzipDecompress(InputStream is,String endcoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static String gzipDecompress(byte[] butes,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "2、deflate(JDK)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static byte[] deflate(byte[] inputByte)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static byre[] inflate(byte[] inputByte)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "3、Snappy\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static byte[] snappyCompress(byte[] inputByte)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static byte[] snappyDecompress(byte[] inputByte)\n" +
            "</code></pre>\">1、gzip 压缩算法\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static byte[] gzipCompressToBytes(String inputStr,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static String gzipCompress(String inputStr,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static String gzipDecompress(InputStream is,String endcoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static String gzipDecompress(byte[] butes,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "2、deflate(JDK)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static byte[] deflate(byte[] inputByte)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static byre[] inflate(byte[] inputByte)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "3、Snappy\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static byte[] snappyCompress(byte[] inputByte)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " static byte[] snappyDecompress(byte[] inputByte)\n" +
            "</code></pre><h5 id=\"3、configutils\"><a name=\"3、configutils\" href=\"#3、configutils\"></a>3、ConfigUtils</h5><pre><code data-origin=\"<pre><code>String getConfig(String key,String default_value)\n" +
            "</code></pre>\">String getConfig(String key,String default_value)\n" +
            "</code></pre><h5 id=\"4、转换类\"><a name=\"4、转换类\" href=\"#4、转换类\"></a>4、转换类</h5><pre><code data-origin=\"<pre><code>类型转换类\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "1:JsonUtils:\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String jsonSerialize(Object obj)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static &amp;lt;T&amp;gt; T jsonDeserialize(String jsonStr,Class&amp;lt;T&amp;gt; valueType)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static &amp;lt;T&amp;gt; List&amp;lt;T&amp;gt; jsonListDeserialize(String jsonStr,Class&amp;lt;T&amp;gt; valueType)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "2:ByteUtils\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String bytes2Hexstr(byte[] bytes)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static byte[] hexStr2Bytes(String hexStr)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String bytes2Str(byte[] bytes,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static byte[] str2Bytes(String str)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static byte[] obj2Bytes(Object obj)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static &amp;lt;T&amp;gt; T bytes2Obj(byte[] byte)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "3:StreamUtils\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static ByteArrayInputStream bytes2InputStream(byte[] buf)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static byte[] inputStream2Bytes(InputStream is)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static StringBuffer inputStream2StringBuffer(InputStream is,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "4:ConvertUtils:\n" +
            "\n" +
            "\n" +
            "\n" +
            "static Integer str2Int(String intStr,Integer defaultValue)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static Long str2Long(String longStr,Long defaultValue)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static Boolean str2Bool(String boolStr,Long defaultValue)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String int2Str(Integer num)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String long2Str(Long num)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String bool2Str(Boolean bool)\n" +
            "</code></pre>\">类型转换类\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "1:JsonUtils:\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String jsonSerialize(Object obj)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static &lt;T&gt; T jsonDeserialize(String jsonStr,Class&lt;T&gt; valueType)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static &lt;T&gt; List&lt;T&gt; jsonListDeserialize(String jsonStr,Class&lt;T&gt; valueType)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "2:ByteUtils\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String bytes2Hexstr(byte[] bytes)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static byte[] hexStr2Bytes(String hexStr)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String bytes2Str(byte[] bytes,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static byte[] str2Bytes(String str)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static byte[] obj2Bytes(Object obj)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static &lt;T&gt; T bytes2Obj(byte[] byte)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "3:StreamUtils\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static ByteArrayInputStream bytes2InputStream(byte[] buf)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static byte[] inputStream2Bytes(InputStream is)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static StringBuffer inputStream2StringBuffer(InputStream is,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "4:ConvertUtils:\n" +
            "\n" +
            "\n" +
            "\n" +
            "static Integer str2Int(String intStr,Integer defaultValue)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static Long str2Long(String longStr,Long defaultValue)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static Boolean str2Bool(String boolStr,Long defaultValue)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String int2Str(Integer num)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String long2Str(Long num)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String bool2Str(Boolean bool)\n" +
            "</code></pre><h5 id=\"5、datetimeutils\"><a name=\"5、datetimeutils\" href=\"#5、datetimeutils\"></a>5、DateTimeUtils</h5><pre><code data-origin=\"<pre><code>日期时间处理类\n" +
            "</code></pre>\">日期时间处理类\n" +
            "</code></pre><h5 id=\"6、encryptutils\"><a name=\"6、encryptutils\" href=\"#6、encryptutils\"></a>6、EncryptUtils</h5><pre><code data-origin=\"<pre><code>加密工具库\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "1、static String md5FileEncrypt32(String filepath)\n" +
            "</code></pre>\">加密工具库\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "1、static String md5FileEncrypt32(String filepath)\n" +
            "</code></pre><h5 id=\"7、httputils\"><a name=\"7、httputils\" href=\"#7、httputils\"></a>7、HttpUtils</h5><pre><code data-origin=\"<pre><code>static String get(String url)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String get(String url,Map&amp;lt;String,String&amp;gt; params)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String post(String url，Map&amp;lt;String,String&amp;gt; params)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String post(String url,File file)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String post(String url,String jsonStr)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String post(String url)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String put(String url,Map&amp;lt;String,String&amp;gt; params)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String delete(String url,Map&amp;lt;String ,String&amp;gt; parmas)\n" +
            "</code></pre>\">static String get(String url)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String get(String url,Map&lt;String,String&gt; params)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String post(String url，Map&lt;String,String&gt; params)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String post(String url,File file)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String post(String url,String jsonStr)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String post(String url)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String put(String url,Map&lt;String,String&gt; params)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String delete(String url,Map&lt;String ,String&gt; parmas)\n" +
            "</code></pre><h5 id=\"8、iputils\"><a name=\"8、iputils\" href=\"#8、iputils\"></a>8、IpUtils</h5><pre><code data-origin=\"<pre><code>ip相关(获取ip4地址，ip转int，ip转long)\n" +
            "</code></pre>\">ip相关(获取ip4地址，ip转int，ip转long)\n" +
            "</code></pre><h5 id=\"9、stringutils\"><a name=\"9、stringutils\" href=\"#9、stringutils\"></a>9、StringUtils</h5><pre><code data-origin=\"<pre><code>字符串检验，检验ip4，数字，Email,网址等\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean isIp4(String ip)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean isNumber(String numStr)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean isNullOrEmpty(Stirng str)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean isNullOrWhiteSpace(String str)\n" +
            "</code></pre>\">字符串检验，检验ip4，数字，Email,网址等\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean isIp4(String ip)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean isNumber(String numStr)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean isNullOrEmpty(Stirng str)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean isNullOrWhiteSpace(String str)\n" +
            "</code></pre><h5 id=\"10、fileutils\"><a name=\"10、fileutils\" href=\"#10、fileutils\"></a>10、FileUtils</h5><pre><code data-origin=\"<pre><code>文件帮助类\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "1、读\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "2、写（追加，覆盖）\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "3、删除\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "4、文件大小\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "private String filePath;\n" +
            "\n" +
            "\n" +
            "\n" +
            "private String encoding;\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean pathExists(String filePath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String getFileName(String filePath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String getDirPath(String filePath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean createDiretory(String dirPath,boolean isCreateParentDir)\n" +
            "\n" +
            "\n" +
            "\n" +
            "#读取全部文件内容 放入一个string对象\n" +
            "\n" +
            "static String readFile(String filePath,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static List&amp;lt;String&amp;gt; readFileToList(String filePath,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static void writeFile(String filePath,String content,String encoding,boolean isAppend)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "#读取全部文件内容 放入一个string对象\n" +
            "\n" +
            "String readFile()\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "List&amp;lt;String&amp;gt; readFileToList()\n" +
            "\n" +
            "\n" +
            "\n" +
            "String readLine()\n" +
            "\n" +
            "\n" +
            "\n" +
            "void witeLine(boolean isAppend)\n" +
            "\n" +
            "\n" +
            "\n" +
            "void writeFile(String content,boolean isAppend)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static bool deleteFile(String filePath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static bool deleteDirectory(String dirPath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static long getFileSize(String filePath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static void moveFile(String srcPath,String desPath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean copyFile(String srcFilePath,String desPath)\n" +
            "</code></pre>\">文件帮助类\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "1、读\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "2、写（追加，覆盖）\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "3、删除\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "4、文件大小\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "private String filePath;\n" +
            "\n" +
            "\n" +
            "\n" +
            "private String encoding;\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean pathExists(String filePath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String getFileName(String filePath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String getDirPath(String filePath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean createDiretory(String dirPath,boolean isCreateParentDir)\n" +
            "\n" +
            "\n" +
            "\n" +
            "#读取全部文件内容 放入一个string对象\n" +
            "\n" +
            "static String readFile(String filePath,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static List&lt;String&gt; readFileToList(String filePath,String encoding)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static void writeFile(String filePath,String content,String encoding,boolean isAppend)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "#读取全部文件内容 放入一个string对象\n" +
            "\n" +
            "String readFile()\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "List&lt;String&gt; readFileToList()\n" +
            "\n" +
            "\n" +
            "\n" +
            "String readLine()\n" +
            "\n" +
            "\n" +
            "\n" +
            "void witeLine(boolean isAppend)\n" +
            "\n" +
            "\n" +
            "\n" +
            "void writeFile(String content,boolean isAppend)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static bool deleteFile(String filePath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static bool deleteDirectory(String dirPath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static long getFileSize(String filePath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static void moveFile(String srcPath,String desPath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static boolean copyFile(String srcFilePath,String desPath)\n" +
            "</code></pre><h5 id=\"11、randomutils\"><a name=\"11、randomutils\" href=\"#11、randomutils\"></a>11、RandomUtils</h5><pre><code data-origin=\"<pre><code>1、随机字符串生成\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "2、随机数生成\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String randomString(char[] chars,long length)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String randomString(long length)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String fixedRandomString(long length)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String fixedRandomString(char[] chars,long length)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static int randomNumber(int max,int min)\n" +
            "</code></pre>\">1、随机字符串生成\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "2、随机数生成\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String randomString(char[] chars,long length)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String randomString(long length)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String fixedRandomString(long length)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String fixedRandomString(char[] chars,long length)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static int randomNumber(int max,int min)\n" +
            "</code></pre><h5 id=\"12、ziputils\"><a name=\"12、ziputils\" href=\"#12、ziputils\"></a>12、ZipUtils</h5><pre><code data-origin=\"<pre><code>static void zipCompress(String filePath,String desPath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static void zipDecompress(String srcPath,String desPath)\n" +
            "</code></pre>\">static void zipCompress(String filePath,String desPath)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static void zipDecompress(String srcPath,String desPath)\n" +
            "</code></pre><h5 id=\"13、emailutils\"><a name=\"13、emailutils\" href=\"#13、emailutils\"></a>13、EmailUtils</h5><pre><code data-origin=\"<pre><code>1、发送email\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static sendEmail(String subject, String content,String receiveAddress)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static sendEmail(String subject, String content,String receiveAddress,String attachmentPath)\n" +
            "</code></pre>\">1、发送email\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static sendEmail(String subject, String content,String receiveAddress)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static sendEmail(String subject, String content,String receiveAddress,String attachmentPath)\n" +
            "</code></pre><h5 id=\"14、reflector\"><a name=\"14、reflector\" href=\"#14、reflector\"></a>14、Reflector</h5><pre><code data-origin=\"<pre><code>static String[] listClassFields(String className,boolean extendsField,FiledTypeEnum type)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String[] listClassMethods(String className,boolean extendsMethod,FiledTypeEnum type)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static void setAttribute(Object obj,String att,Object value,Class&amp;lt;?&amp;gt; type)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static Class getClassType(String className)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static &amp;lt;T&amp;gt; T createInstance(String className,Class[] paramTypes,Object[] paramValus)\n" +
            "\n" +
            "\n" +
            "\n" +
            "#实例方法调用\n" +
            "\n" +
            "staic Object invoke(String className，Class[] constructorTypes,Object[] constructorValues,String methodName, Class[] methodParamsType,Object[] methodParamValues)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static Object invokeClassMethod(String className,String methodName, Class[] methodParamsType,Object[] methodParamValues)\n" +
            "\n" +
            ")\n" +
            "</code></pre>\">static String[] listClassFields(String className,boolean extendsField,FiledTypeEnum type)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static String[] listClassMethods(String className,boolean extendsMethod,FiledTypeEnum type)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static void setAttribute(Object obj,String att,Object value,Class&lt;?&gt; type)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static Class getClassType(String className)\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "static &lt;T&gt; T createInstance(String className,Class[] paramTypes,Object[] paramValus)\n" +
            "\n" +
            "\n" +
            "\n" +
            "#实例方法调用\n" +
            "\n" +
            "staic Object invoke(String className，Class[] constructorTypes,Object[] constructorValues,String methodName, Class[] methodParamsType,Object[] methodParamValues)\n" +
            "\n" +
            "\n" +
            "\n" +
            "static Object invokeClassMethod(String className,String methodName, Class[] methodParamsType,Object[] methodParamValues)\n" +
            "\n" +
            ")\n" +
            "</code></pre>\n" +
            "\n" +
            "<footer style=\"position:fixed; font-size:.8em; text-align:right; bottom:0px; margin-left:-25px; height:20px; width:100%;\">generated by <a href=\"http://pad.haroopress.com\" target=\"_blank\">haroopad</a></footer>\n" +
            "</body>\n" +
            "</html>\n";

//    @Test
//    public void sendEmail1() throws Exception {
//
//        EmailUtils emailUtils = new EmailUtils(String.format("%s\\config\\email.properties", System.getProperty("user.dir")));
//        for (int i = 0;i<2;i++){
//            emailUtils.sendEmail("email send test", content, "E:\\test.txt", new String[]{"shusf@ct108.com"});
//        }
//        assert true;
//    }
//
//    @Test
//    public void sendEmail() throws Exception {
//        EmailUtils emailUtils = new EmailUtils(String.format("%s\\config\\email.properties", System.getProperty("user.dir")));
//        emailUtils.sendEmail("email send test", "哈哈哈哈", new String[]{"shusf@ct108.com"});
//        assert true;
//    }

}