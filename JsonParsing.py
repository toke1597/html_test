import json
import time
from urllib.request import urlopen

# 함수명 : getOpened


def getOpened(ip):
    response = urlopen("http://" + ip).read().decode('utf-8')
    responseJson = json.loads(response)
    return responseJson.get("opened")


while True:
    time.sleep(3)
    if __name__ == '__main__':
        print("getOpened : ")
        print(getOpened("192.168.0.8:8000"))
        # 이거 포트 까지 입력해야함.. 8000
