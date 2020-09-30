# REST-API를 통한 image전송

- POST로 BODY에 이미지 파일을 담아서 보낸다
<img width="935" alt="스크린샷 2020-10-01 오전 5 08 53" src="https://user-images.githubusercontent.com/45715241/94734650-7c4ef000-03a4-11eb-8da4-9cf66d1b726f.png">

- Get을 통하여 호출
<img width="938" alt="스크린샷 2020-10-01 오전 5 09 08" src="https://user-images.githubusercontent.com/45715241/94734733-9be61880-03a4-11eb-9cf7-802e9264aad4.png">

|Http Method|uri|설명|
|------|---|---|
|POST|/uploadfile| param:file value: imagefile 단건의 이미지일파|
|POST|/uploadfile/multiplefile|param: files value: imagefile 다중 이미지파|
|GET|/downloadfile/{imagefilename}|param: pathvariable(imagename) 이미지를 이름으로 가져온다|