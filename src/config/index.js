import { Platform, NativeModules } from 'react-native';
import defaultConfig from './default.json';
import development from './development.json';
import test from './test.json';
import staging from './staging.json';
import production from './production.json';

const config = { development, test, staging, production };

const { ReactNativeConfig } = NativeModules;
const environment = ReactNativeConfig.buildEnvironment;
const environmentConfig = config[environment];

export default {
  environment,
  ...Object.assign({}, defaultConfig, environmentConfig, environmentConfig[Platform.OS])
};
